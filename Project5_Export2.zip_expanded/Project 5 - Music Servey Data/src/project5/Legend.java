package project5;


import java.awt.Color;
import CS2114.Shape;
import CS2114.TextShape;

public class Legend {
    public TextShape title;
    public TextShape text1;
    public TextShape text2;
    public TextShape text3;
    public TextShape text4;
    public TextShape songTitle;
    public TextShape heardOrLikes;
    public Shape legendBox;
    public Shape legendBox2;
    public Shape breaker;

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

