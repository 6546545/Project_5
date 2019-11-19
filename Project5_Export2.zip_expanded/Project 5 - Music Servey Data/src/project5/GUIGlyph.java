package project5;

import java.awt.Color;
import CS2114.Shape;
import CS2114.TextShape;

public class GUIGlyph {
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
    private Shape[] sArr;
    private TextShape[] tArr;


    public GUIGlyph(Shape[] s) {
        // Glyph Bars ROW 1
        bar1 = new Shape(100, 50, 50, 10, Color.magenta);
        bar2 = new Shape(75, 60, 100, 10, Color.blue);
        bar3 = new Shape(80, 70, 80, 10, Color.orange);
        bar4 = new Shape(110, 80, 20, 10, Color.green);
        bar37 = new Shape(120, 50, 5, 40, Color.black);

        bar5 = new Shape(78, 150, 50, 10, Color.magenta);
        bar6 = new Shape(100, 160, 100, 10, Color.blue);
        bar7 = new Shape(80, 170, 80, 10, Color.orange);
        bar8 = new Shape(110, 180, 20, 10, Color.green);
        bar38 = new Shape(120, 150, 5, 40, Color.black);

        bar9 = new Shape(78, 250, 100, 10, Color.magenta);
        bar10 = new Shape(100, 260, 100, 10, Color.blue);
        bar11 = new Shape(80, 270, 50, 10, Color.orange);
        bar12 = new Shape(110, 280, 60, 10, Color.green);
        bar39 = new Shape(120, 250, 5, 40, Color.black);

        // Glyph Bars ROW2
        bar13 = new Shape(400, 50, 58, 10, Color.magenta);
        bar14 = new Shape(375, 60, 45, 10, Color.blue);
        bar15 = new Shape(380, 70, 80, 10, Color.orange);
        bar16 = new Shape(410, 80, 36, 10, Color.green);
        bar40 = new Shape(420, 50, 5, 40, Color.black);

        bar17 = new Shape(408, 150, 50, 10, Color.magenta);
        bar18 = new Shape(400, 160, 100, 10, Color.blue);
        bar19 = new Shape(380, 170, 80, 10, Color.orange);
        bar20 = new Shape(410, 180, 60, 10, Color.green);
        bar41 = new Shape(420, 150, 5, 40, Color.black);

        bar21 = new Shape(378, 250, 100, 10, Color.magenta);
        bar22 = new Shape(410, 260, 100, 10, Color.blue);
        bar23 = new Shape(415, 270, 50, 10, Color.orange);
        bar24 = new Shape(419, 280, 60, 10, Color.green);
        bar42 = new Shape(420, 250, 5, 40, Color.black);

        // Glyph Bars ROW3
        bar25 = new Shape(700, 50, 100, 10, Color.magenta);
        bar26 = new Shape(675, 60, 45, 10, Color.blue);
        bar27 = new Shape(680, 70, 45, 10, Color.orange);
        bar28 = new Shape(710, 80, 90, 10, Color.green);
        bar43 = new Shape(720, 50, 5, 40, Color.black);

        bar29 = new Shape(708, 150, 65, 10, Color.magenta);
        bar30 = new Shape(700, 160, 78, 10, Color.blue);
        bar32 = new Shape(680, 170, 75, 10, Color.orange);
        bar33 = new Shape(710, 180, 40, 10, Color.green);
        bar44 = new Shape(720, 150, 5, 40, Color.black);

        bar34 = new Shape(678, 250, 65, 10, Color.magenta);
        bar35 = new Shape(710, 260, 20, 10, Color.blue);
        bar36 = new Shape(715, 270, 60, 10, Color.orange);
        bar37 = new Shape(719, 280, 20, 10, Color.green);
        bar45 = new Shape(720, 250, 5, 40, Color.black);

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

        sArr = new Shape[] {};
        tArr = new TextShape[] { song1, song2, song3, song4, song5, song6,
            song7, song8, song9, auth1, auth2, auth3, auth4, auth5, auth6,
            auth7, auth8, auth9 };

    }


    public Shape[] getsArr() {
        return sArr;
    }


    public void setsArr(Shape[] sArr) {
        this.sArr = sArr;
    }


    public TextShape[] gettArr() {
        return tArr;
    }


    public void settArr(TextShape[] tArr) {
        this.tArr = tArr;
    }

}
