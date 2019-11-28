// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros
//

package prj5;

import java.awt.Color;
import CS2114.Shape;
import CS2114.TextShape;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */

public class Legend {
    /**
     * Public Variables
     */

    /**
     * The textshape for the title of what the legend will display
     * i.e. displaying based on Hobby, Major, or Location
     * It is located at the top of the box.
     */
    public TextShape title;
    /**
     * Option 1(Hobby, Major,Location)
     */
    public TextShape text1;
    /**
     * Option 2(Hobby, Major,Location)
     */
    public TextShape text2;
    /**
     * Option 3(Hobby, Major,Location)
     */
    public TextShape text3;
    /**
     * Option 4(Hobby, Major,Location)
     */
    public TextShape text4;
    /**
     * Song Title
     */
    public TextShape songTitle;
    /**
     * Heard or Likes
     */
    public TextShape heardOrLikes;

    /**
     * legendBox (White Box)
     */
    public Shape legendBox;
    /**
     * legendBox2(Black Outline)
     */
    public Shape legendBox2;
    /**
     * The black divider shape present on
     * the legend.
     */
    public Shape breaker;


    /**
     * Legend
     */
    public Legend() {
        title = new TextShape(870, 190, "");
        songTitle = new TextShape(885, 290, "Song Title");
        text1 = new TextShape(865, 210, "");
        text2 = new TextShape(865, 230, "");
        text3 = new TextShape(865, 250, "");
        text4 = new TextShape(865, 270, "");
        heardOrLikes = new TextShape(880, 330, "Heard  Likes");

        legendBox = new Shape(860, 200, 120, 175, Color.black);
        legendBox2 = new Shape(862, 202, 115, 170, Color.white);
        breaker = new Shape(922, 320, 5, 50, Color.black);

        title.setBackgroundColor(Color.white);
        songTitle.setBackgroundColor(Color.white);
        text1.setBackgroundColor(Color.white);
        text2.setBackgroundColor(Color.white);
        text3.setBackgroundColor(Color.white);
        text4.setBackgroundColor(Color.white);
        heardOrLikes.setBackgroundColor(Color.white);
    }

}
