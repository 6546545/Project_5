package project5;

import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros

/**
 * @author Andy Gould, Dwarakh Nayam, and Kevin Kapros
 * @version 2019.11.14
 */
public class GUI {
    /**
     * Lots of Private Variables
     */

    private Button prev;
    private Button next;
    private Button sortArt;
    private Button sortYr;
    private Button sortTitle;
    private Button sortGenre;
    private Button repHobby;
    private Button repMaj;
    private Button repRegion;
    private Button quit;
    private Shape[] glyphArray;
    private int heardLength;
    private int likesLength;
    private String songToString;
    private Window window;
    private Legend legend;

    private Shape bar1;
    private Shape bar2;
    private Shape bar3;
    private Shape bar4;

    private Shape bar5;
    private Shape bar6;
    private Shape bar7;
    private Shape bar8;

    private Shape bar9;
    private Shape bar10;
    private Shape bar11;
    private Shape bar12;

    private Shape bar13;
    private Shape bar14;
    private Shape bar15;
    private Shape bar16;

    private Shape bar17;
    private Shape bar18;
    private Shape bar19;
    private Shape bar20;

    private Shape bar21;
    private Shape bar22;
    private Shape bar23;
    private Shape bar24;

    private Shape bar25;
    private Shape bar26;
    private Shape bar27;
    private Shape bar28;

    private Shape bar29;
    private Shape bar30;
    private Shape bar31;
    private Shape bar32;

    private Shape bar33;
    private Shape bar34;
    private Shape bar35;
    private Shape bar36;

    private Shape bar37;
    private Shape bar38;
    private Shape bar39;
    private Shape bar40;
    private Shape bar41;
    private Shape bar42;
    private Shape bar43;
    private Shape bar44;
    private Shape bar45;

    private TextShape song1;
    private TextShape song2;
    private TextShape song3;
    private TextShape song4;
    private TextShape song5;
    private TextShape song6;
    private TextShape song7;
    private TextShape song8;
    private TextShape song9;

    private TextShape auth1;
    private TextShape auth2;
    private TextShape auth3;
    private TextShape auth4;
    private TextShape auth5;
    private TextShape auth6;
    private TextShape auth7;
    private TextShape auth8;
    private TextShape auth9;

    /**
     * Default Constructor
     * 
     */
    public GUI() {
        prev = new Button("<- Prev");
        next = new Button("Next ->");
        sortArt = new Button("Sort by Artist Name");
        sortTitle = new Button("Sort by Song Title");
        sortYr = new Button("Sort by Release Year");
        sortGenre = new Button("Sort by Genre");
        repHobby = new Button("Represent Hobby");
        repHobby.onClick(this, "repHobbyOnClicked");
        repMaj = new Button("Represent Major");
        repMaj.onClick(this, "repMajOnClicked");
        repRegion = new Button("Represent Region");
        repRegion.onClick(this, "repRegOnClicked");
        quit = new Button("Quit");
        quit.onClick(this, "quitOnClicked");
        glyphArray = new Shape[] {};
        heardLength = 0;
        likesLength = 0;
        songToString = "";
        window = new Window("Project 5");
        window.setSize(1000, 500);

        window.addButton(prev, WindowSide.NORTH);
        window.addButton(sortArt, WindowSide.NORTH);
        window.addButton(sortTitle, WindowSide.NORTH);
        window.addButton(sortYr, WindowSide.NORTH);
        window.addButton(sortGenre, WindowSide.NORTH);
        window.addButton(next, WindowSide.NORTH);
        window.addButton(repHobby, WindowSide.SOUTH);
        window.addButton(repMaj, WindowSide.SOUTH);
        window.addButton(repRegion, WindowSide.SOUTH);
        window.addButton(quit, WindowSide.SOUTH);
        legend = new Legend();

        window.addShape(legend.legendBox);
        window.addShape(legend.legendBox2);

        legend.title.setText("Hobby Legend");
        legend.text1.setText("Music");
        legend.text2.setText("Reading");
        legend.text3.setText("Art");
        legend.text4.setText("Sports");

        legend.text1.setForegroundColor(Color.MAGENTA);
        legend.text2.setForegroundColor(Color.BLUE);
        legend.text3.setForegroundColor(Color.ORANGE);
        legend.text4.setForegroundColor(Color.GREEN);

        window.addShape(legend.title);
        window.addShape(legend.text1);
        window.addShape(legend.text2);
        window.addShape(legend.text3);
        window.addShape(legend.text4);
        window.addShape(legend.songTitle);
        window.addShape(legend.heardOrLikes);
        window.addShape(legend.breaker);
        window.moveToFront(legend.legendBox2);
        window.moveToFront(legend.title);
        window.moveToFront(legend.text1);
        window.moveToFront(legend.text2);
        window.moveToFront(legend.text3);
        window.moveToFront(legend.text4);
        window.moveToFront(legend.songTitle);
        window.moveToFront(legend.heardOrLikes);
        window.moveToFront(legend.breaker);

        // Glyph Bars ROW 1
        bar1 = new Shape(100, 50, 50, 10, Color.magenta);
        bar2 = new Shape(75, 60, 100, 10, Color.blue);
        bar3 = new Shape(80, 70, 80, 10, Color.orange);
        bar4 = new Shape(110, 80, 20, 10, Color.green);
        bar37 = new Shape(120, 50, 5, 40, Color.black);
        window.addShape(bar1);
        window.addShape(bar2);
        window.addShape(bar3);
        window.addShape(bar4);
        window.addShape(bar37);
        window.moveToFront(bar37);

        bar5 = new Shape(78, 150, 50, 10, Color.magenta);
        bar6 = new Shape(100, 160, 100, 10, Color.blue);
        bar7 = new Shape(80, 170, 80, 10, Color.orange);
        bar8 = new Shape(110, 180, 20, 10, Color.green);
        bar38 = new Shape(120, 150, 5, 40, Color.black);
        window.addShape(bar5);
        window.addShape(bar6);
        window.addShape(bar7);
        window.addShape(bar8);
        window.addShape(bar38);
        window.moveToFront(bar38);

        bar9 = new Shape(78, 250, 100, 10, Color.magenta);
        bar10 = new Shape(100, 260, 100, 10, Color.blue);
        bar11 = new Shape(80, 270, 50, 10, Color.orange);
        bar12 = new Shape(110, 280, 60, 10, Color.green);
        bar39 = new Shape(120, 250, 5, 40, Color.black);
        window.addShape(bar9);
        window.addShape(bar10);
        window.addShape(bar11);
        window.addShape(bar12);
        window.addShape(bar39);
        window.moveToFront(bar39);

        // Glyph Bars ROW2
        bar13 = new Shape(400, 50, 58, 10, Color.magenta);
        bar14 = new Shape(375, 60, 45, 10, Color.blue);
        bar15 = new Shape(380, 70, 80, 10, Color.orange);
        bar16 = new Shape(410, 80, 36, 10, Color.green);
        bar40 = new Shape(420, 50, 5, 40, Color.black);
        window.addShape(bar13);
        window.addShape(bar14);
        window.addShape(bar15);
        window.addShape(bar16);
        window.addShape(bar40);
        window.moveToFront(bar40);

        bar17 = new Shape(408, 150, 50, 10, Color.magenta);
        bar18 = new Shape(400, 160, 100, 10, Color.blue);
        bar19 = new Shape(380, 170, 80, 10, Color.orange);
        bar20 = new Shape(410, 180, 60, 10, Color.green);
        bar41 = new Shape(420, 150, 5, 40, Color.black);
        window.addShape(bar17);
        window.addShape(bar18);
        window.addShape(bar19);
        window.addShape(bar20);
        window.addShape(bar41);
        window.moveToFront(bar41);

        bar21 = new Shape(378, 250, 100, 10, Color.magenta);
        bar22 = new Shape(410, 260, 100, 10, Color.blue);
        bar23 = new Shape(415, 270, 50, 10, Color.orange);
        bar24 = new Shape(419, 280, 60, 10, Color.green);
        bar42 = new Shape(420, 250, 5, 40, Color.black);
        window.addShape(bar21);
        window.addShape(bar22);
        window.addShape(bar23);
        window.addShape(bar24);
        window.addShape(bar42);
        window.moveToFront(bar42);

        // Glyph Bars ROW3
        bar25 = new Shape(700, 50, 100, 10, Color.magenta);
        bar26 = new Shape(675, 60, 45, 10, Color.blue);
        bar27 = new Shape(680, 70, 45, 10, Color.orange);
        bar28 = new Shape(710, 80, 90, 10, Color.green);
        bar43 = new Shape(720, 50, 5, 40, Color.black);
        window.addShape(bar25);
        window.addShape(bar26);
        window.addShape(bar27);
        window.addShape(bar28);
        window.addShape(bar43);
        window.moveToFront(bar43);

        bar29 = new Shape(708, 150, 65, 10, Color.magenta);
        bar30 = new Shape(700, 160, 78, 10, Color.blue);
        bar32 = new Shape(680, 170, 75, 10, Color.orange);
        bar33 = new Shape(710, 180, 40, 10, Color.green);
        bar44 = new Shape(720, 150, 5, 40, Color.black);
        window.addShape(bar29);
        window.addShape(bar30);
        window.addShape(bar32);
        window.addShape(bar33);
        window.addShape(bar44);
        window.moveToFront(bar44);

        bar34 = new Shape(678, 250, 65, 10, Color.magenta);
        bar35 = new Shape(710, 260, 20, 10, Color.blue);
        bar36 = new Shape(715, 270, 60, 10, Color.orange);
        bar37 = new Shape(719, 280, 20, 10, Color.green);
        bar45 = new Shape(720, 250, 5, 40, Color.black);
        window.addShape(bar34);
        window.addShape(bar35);
        window.addShape(bar36);
        window.addShape(bar37);
        window.addShape(bar45);
        window.moveToFront(bar45);

        song1 = new TextShape(70, 10, "Call Me Maybe");
        song2 = new TextShape(70, 110, "Every Breath You Take");
        song3 = new TextShape(70, 210, "Hello");
        song4 = new TextShape(420, 10, "Dancing Queen");
        song5 = new TextShape(420, 110, "Eye of The Tiger");
        song6 = new TextShape(420, 210, "Help!");
        song7 = new TextShape(720, 10, "Empire State of Mind");
        song8 = new TextShape(720, 110, "Gold Digger");
        song9 = new TextShape(720, 210, "Hey Jude");
        song1.setBackgroundColor(Color.WHITE);
        song2.setBackgroundColor(Color.WHITE);
        song3.setBackgroundColor(Color.WHITE);
        song4.setBackgroundColor(Color.WHITE);
        song5.setBackgroundColor(Color.WHITE);
        song6.setBackgroundColor(Color.WHITE);
        song7.setBackgroundColor(Color.WHITE);
        song8.setBackgroundColor(Color.WHITE);
        song9.setBackgroundColor(Color.WHITE);

        auth1 = new TextShape(70, 30, "by Carly Rae Jepsen");
        auth2 = new TextShape(70, 130, "by The Police");
        auth3 = new TextShape(70, 230, "by Adele");
        auth4 = new TextShape(420, 30, "by ABBA");
        auth5 = new TextShape(420, 130, "by Survivor");
        auth6 = new TextShape(420, 230, "by The Beatles");
        auth7 = new TextShape(720, 30, "by Jay Z and Alicia Keys");
        auth8 = new TextShape(720, 130, "by Kanye West");
        auth9 = new TextShape(720, 230, "by The Beatles");

        auth1.setBackgroundColor(Color.WHITE);
        auth2.setBackgroundColor(Color.WHITE);
        auth3.setBackgroundColor(Color.WHITE);
        auth4.setBackgroundColor(Color.WHITE);
        auth5.setBackgroundColor(Color.WHITE);
        auth6.setBackgroundColor(Color.WHITE);
        auth7.setBackgroundColor(Color.WHITE);
        auth8.setBackgroundColor(Color.WHITE);
        auth9.setBackgroundColor(Color.WHITE);

        window.addShape(song1);
        window.addShape(song2);
        window.addShape(song3);
        window.addShape(song4);
        window.addShape(song5);
        window.addShape(song6);
        window.addShape(song7);
        window.addShape(song8);
        window.addShape(song9);

        window.addShape(auth1);
        window.addShape(auth2);
        window.addShape(auth3);
        window.addShape(auth4);
        window.addShape(auth5);
        window.addShape(auth6);
        window.addShape(auth7);
        window.addShape(auth8);
        window.addShape(auth9);

    }

    
    /**
     * Hobby Legend
     * 
     * @param Legend
     */
    private void hobbyLegend(Legend legend) {
        window.addShape(legend.legendBox);
        window.addShape(legend.legendBox2);

        legend.title.setText("Hobby Legend");
        legend.text1.setText("Music");
        legend.text2.setText("Reading");
        legend.text3.setText("Art");
        legend.text4.setText("Sports");

        legend.text1.setForegroundColor(Color.MAGENTA);
        legend.text2.setForegroundColor(Color.BLUE);
        legend.text3.setForegroundColor(Color.ORANGE);
        legend.text4.setForegroundColor(Color.GREEN);

        window.addShape(legend.title);
        window.addShape(legend.text1);
        window.addShape(legend.text2);
        window.addShape(legend.text3);
        window.addShape(legend.text4);
        window.addShape(legend.songTitle);
        window.addShape(legend.heardOrLikes);
        window.addShape(legend.breaker);
        window.moveToFront(legend.legendBox2);
        window.moveToFront(legend.title);
        window.moveToFront(legend.text1);
        window.moveToFront(legend.text2);
        window.moveToFront(legend.text3);
        window.moveToFront(legend.text4);
        window.moveToFront(legend.songTitle);
        window.moveToFront(legend.heardOrLikes);
        window.moveToFront(legend.breaker);
    }

    /**
     * Prints the Info to the Window
     * 
     * @param SA SongAnalytic SA
     * @param PE the PositionEnum
     */
    private void printDetails(SongAnalytics SA/* , PostionEnum PE */) {

    }

    
    /**
     * OnClicked for previous
     */
    public void prevOnClicked() {

    }

    
    /**
     * OnClicked for next
     */
    public void nextOnClicked() {

    }

    
    /**
     * OnClicked for sortArt
     */
    public void sortArtOnClicked() {

    }

    
    /**
     * OnClicked for sortTitle
     */
    public void sortTitleOnClicked() {

    }

    
    /**
     * OnClicked for sortYear
     */
    public void sortYrOnClicked() {

    }

    
    /**
     * OnClicked for sortGenre
     */
    public void sortGenreOnClicked() {

    }

    /**
     * 
     */
    public void repHobbyOnClicked(Button button) {
        hobbyLegend(legend);
    }

    /**
     * 
     */
    public void repMajOnClicked(Button button) {
        window.addShape(legend.legendBox);
        window.addShape(legend.legendBox2);

        legend.title.setText("Major Legend");
        legend.text1.setText("Math or CMDA");
        legend.text2.setText("Comp. Science");
        legend.text3.setText("Engineering");
        legend.text4.setText("Other");

        legend.text1.setForegroundColor(Color.MAGENTA);
        legend.text2.setForegroundColor(Color.BLUE);
        legend.text3.setForegroundColor(Color.ORANGE);
        legend.text4.setForegroundColor(Color.GREEN);

        window.addShape(legend.title);
        window.addShape(legend.text1);
        window.addShape(legend.text2);
        window.addShape(legend.text3);
        window.addShape(legend.text4);
        window.addShape(legend.songTitle);
        window.addShape(legend.heardOrLikes);
        window.addShape(legend.breaker);
        window.moveToFront(legend.legendBox2);
        window.moveToFront(legend.title);
        window.moveToFront(legend.text1);
        window.moveToFront(legend.text2);
        window.moveToFront(legend.text3);
        window.moveToFront(legend.text4);
        window.moveToFront(legend.songTitle);
        window.moveToFront(legend.heardOrLikes);
        window.moveToFront(legend.breaker);
    }

    /**
     * 
     */
    public void repRegOnClicked(Button button) {
        window.addShape(legend.legendBox);
        window.addShape(legend.legendBox2);

        legend.title.setText("Region Legend");
        legend.text1.setText("Northeast");
        legend.text2.setText("Southeast");
        legend.text3.setText("U.S(Not SE/NE)");
        legend.text4.setText("Outside U.S");

        legend.text1.setForegroundColor(Color.MAGENTA);
        legend.text2.setForegroundColor(Color.BLUE);
        legend.text3.setForegroundColor(Color.ORANGE);
        legend.text4.setForegroundColor(Color.GREEN);

        window.addShape(legend.title);
        window.addShape(legend.text1);
        window.addShape(legend.text2);
        window.addShape(legend.text3);
        window.addShape(legend.text4);
        window.addShape(legend.songTitle);
        window.addShape(legend.heardOrLikes);
        window.addShape(legend.breaker);
        window.moveToFront(legend.legendBox2);
        window.moveToFront(legend.title);
        window.moveToFront(legend.text1);
        window.moveToFront(legend.text2);
        window.moveToFront(legend.text3);
        window.moveToFront(legend.text4);
        window.moveToFront(legend.songTitle);
        window.moveToFront(legend.heardOrLikes);
        window.moveToFront(legend.breaker);
    }

    /**
     * 
     */
    public void quitOnClicked(Button quit) {

        System.exit(0);
    }

    /**
     * 
     */
    private void update() {

    }

}
