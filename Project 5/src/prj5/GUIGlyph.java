package prj5;

import java.awt.Color;
import CS2114.Shape;
import CS2114.TextShape;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros

/**
 * @author Andy Gould, Dwarakh Nayam, and Kevin Kapros
 * @version 2019.12.03
 */

public class GUIGlyph {
    /**
     * Private Vars
     */
    private int heardLength;
    private int likesLength;

    private Shape bar1;
    private Shape bar2;
    private Shape bar3;
    private Shape bar4;
    private Shape bar11;
    private Shape bar22;
    private Shape bar33;
    private Shape bar44;
    private Shape divider;

    private TextShape song;

    private TextShape auth;
    private SongAnalytics SA;
    private Song songs;


    /**
     * Constructor
     * 
     * @param sA
     *            songAnalytics given
     * @param pos
     *            Position given
     * @param legendOption
     *            LegendOption given
     */
    public GUIGlyph(SongAnalytics sA, Position pos, int legendOption) {
        songs = sA.getSong();
        SA = sA;
        int[] HL = sA.getLegendPercentagesForSong(legendOption + 1);
        song = new TextShape(pos.getPosX() - 100, pos.getPosY() - 40, SA
            .getSong().getTitle().toString());
        song.setX(pos.getPosX() - song.getWidth() / 2);
        song.setBackgroundColor(Color.white);
        auth = new TextShape(pos.getPosX() - 100, pos.getPosY() - 20, "By " + SA
            .getSong().getAuthor().toString());
        auth.setX(pos.getPosX() - auth.getWidth() / 2);
        auth.setBackgroundColor(Color.white);
        heardLength = HL[0];// Get HeardLength
        likesLength = HL[1];// Get LikesLength
        bar1 = new Shape(pos.getPosX() - heardLength, pos.getPosY(),
            heardLength, 10, Color.magenta);
        bar11 = new Shape(pos.getPosX(), pos.getPosY(), likesLength, 10,
            Color.magenta);
        heardLength = HL[2];// Get HeardLength
        likesLength = HL[3];// Get LikesLength
        bar2 = new Shape(pos.getPosX() - heardLength, pos.getPosY() + 10,
            heardLength, 10, Color.blue);
        bar22 = new Shape(pos.getPosX(), pos.getPosY() + 10, likesLength, 10,
            Color.blue);
        heardLength = HL[4];// Get HeardLength
        likesLength = HL[5];// Get LikesLength
        bar3 = new Shape(pos.getPosX() - heardLength, pos.getPosY() + 20,
            heardLength, 10, Color.orange);
        bar33 = new Shape(pos.getPosX(), pos.getPosY() + 20, likesLength, 10,
            Color.orange);
        heardLength = HL[6];// Get HeardLength
        likesLength = HL[7];// Get LikesLength
        bar4 = new Shape(pos.getPosX() - heardLength, pos.getPosY() + 30,
            heardLength, 10, Color.green);
        bar44 = new Shape(pos.getPosX(), pos.getPosY() + 30, likesLength, 10,
            Color.green);
        divider = new Shape(pos.getPosX(), pos.getPosY(), 5, 40, Color.black);

    }


    /**
     * GetBar1
     * 
     * @return bar1 The first bar
     */
    public Shape getBar1() {
        return bar1;
    }


    /**
     * Set Bar1
     * 
     * @param bar1
     *            The bar being set
     */
    public void setBar1(Shape bar1) {
        this.bar1 = bar1;
    }


    /**
     * GetBar2
     * 
     * @return Bar2
     */
    public Shape getBar2() {
        return bar2;
    }


    /**
     * SetBar2
     * 
     * @param bar2
     *            Bar 2
     */
    public void setBar2(Shape bar2) {
        this.bar2 = bar2;
    }


    /**
     * GetBar3
     * 
     * @return bar 3
     */
    public Shape getBar3() {
        return bar3;
    }


    /**
     * Sets Bar 3
     * 
     * @param bar3
     *            the bar getting set
     */
    public void setBar3(Shape bar3) {
        this.bar3 = bar3;
    }


    /**
     * Get Bar 4
     * 
     * @return bar 4
     */
    public Shape getBar4() {
        return bar4;
    }


    /**
     * Sets Bar 4
     * 
     * @param bar4
     *            the bar being set
     */
    public void setBar4(Shape bar4) {
        this.bar4 = bar4;
    }


    /**
     * Gets the Divider
     * 
     * @return returns divider
     */
    public Shape getDivider() {
        return divider;
    }


    /**
     * Sets Divider
     * 
     * @param divider
     *            the shape being set
     */
    public void setDivider(Shape divider) {
        this.divider = divider;
    }


    /**
     * Gets Song Title
     * 
     * @return returns song TextShape
     */
    public TextShape getSong() {
        return song;
    }


    /**
     * Sets Song
     * 
     * @param song
     *            the song being set
     */
    public void setSong(TextShape song) {
        this.song = song;
    }


    /**
     * Gets Song Analytics
     * 
     * @return returns SongAnalytics
     */
    public SongAnalytics getSA() {
        return SA;
    }


    /**
     * Sets Song Analytics
     * 
     * @param sA
     *            the Song Analytics that is set
     */
    public void setSA(SongAnalytics sA) {
        SA = sA;
    }


    /**
     * Returns the song in the glyph.
     * 
     * @return Song
     */

    public Song getSongs() {
        return songs;
    }


    /**
     * Sets the Song
     * 
     * @param songs
     *            the Song paramater
     */
    public void setSongs(Song songs) {
        this.songs = songs;
    }


    /**
     * Gets the Likes Bar
     * 
     * @return returns Bar11
     */
    public Shape getBar11() {
        return bar11;
    }


    /**
     * Sets Bar11
     * 
     * @param bar11
     *            the bar being set
     */
    public void setBar11(Shape bar11) {
        this.bar11 = bar11;
    }


    /**
     * Gets the Likes Bar 22
     * 
     * @return returns bar22
     */
    public Shape getBar22() {
        return bar22;
    }


    /**
     * Sets Bar22
     * 
     * @param bar22
     *            the likes bar that is being set
     */
    public void setBar22(Shape bar22) {
        this.bar22 = bar22;
    }


    /**
     * Gets the Likes Bar 33
     * 
     * @return returns bar33
     */
    public Shape getBar33() {
        return bar33;
    }


    /**
     * Sets Bar33
     * 
     * @param bar33
     */
    public void setBar33(Shape bar33) {
        this.bar33 = bar33;
    }


    /**
     * Gets the Likes Bar 44
     * 
     * @return returns bar44
     */
    public Shape getBar44() {
        return bar44;
    }


    /**
     * Sets Bar44
     * 
     * @param bar44
     */
    public void setBar44(Shape bar44) {
        this.bar44 = bar44;
    }


    /**
     * Gets song author
     * 
     * @return returns the song author
     */
    public TextShape getAuth() {
        return auth;
    }


    /**
     * Sets the song author
     * 
     * @param auth
     *            TextShape
     */
    public void setAuth(TextShape auth) {
        this.auth = auth;
    }


    /**
     * Gets the amount of people who have heard of the songs
     * 
     * @return returns heardLength
     */
    public int getHL() {
        return heardLength;
    }


    /**
     * Sets heardLength
     * 
     * @param heardLength
     *            int
     */
    public void setHL(int heardLength) {
        this.heardLength = heardLength;
    }


    /**
     * Gets the length of the like bar
     * 
     * @param int
     */
    public int getLL() {
        return likesLength;
    }


    /**
     * Sets the LikesLength
     * 
     * @param likesLength
     *            int
     */
    public void setLL(int likesLength) {
        this.likesLength = likesLength;
    }
}
