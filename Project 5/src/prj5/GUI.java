package prj5;

import java.awt.Color;
import CS2114.Button;
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
 * @version 2019.12.03
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
    private Window window;
    private Legend legend;
    private SongAnalytics sA;

    private FileReader fileReader;
    private DLLinkedListNodes<SongAnalytics> songAnalytics;
    private int pageNum = 0;
    private int legendOption = 0;
    private int maxPage = 0;

    private String sortBy = "";


    /**
     * Default Constructor - Initializes everything.
     * 
     */
    public GUI(FileReader FR) {
        fileReader = FR;
        songAnalytics = FR.getDLLLNSongAnalytics();

        if (songAnalytics.size() % 9 != 0) {
            maxPage = songAnalytics.size() / 9 + 1;
        }
        else {
            maxPage = songAnalytics.size() / 9;
        }

        prev = new Button("<- Prev");
        prev.onClick(this, "prevOnClicked");
        next = new Button("Next ->");
        next.onClick(this, "nextOnClicked");
        sortArt = new Button("Sort by Artist Name");
        sortArt.onClick(this, "sortArtOnClicked");
        sortTitle = new Button("Sort by Song Title");
        sortTitle.onClick(this, "sortTitleOnClicked");
        sortYr = new Button("Sort by Release Year");
        sortYr.onClick(this, "sortYrOnClicked");
        sortGenre = new Button("Sort by Genre");
        sortGenre.onClick(this, "sortGenreOnClicked");
        repHobby = new Button("Represent Hobby");
        repHobby.onClick(this, "repHobbyOnClicked");
        repMaj = new Button("Represent Major");
        repMaj.onClick(this, "repMajOnClicked");
        repRegion = new Button("Represent Region");
        repRegion.onClick(this, "repRegOnClicked");
        quit = new Button("Quit");
        quit.onClick(this, "quitOnClicked");

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

        sortArtOnClicked(sortArt);

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
     * Hobby Legend - Default legend that is always
     * displayed if hobby is selected
     * 
     * @param Legend
     *            The Legend
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
     * @param SA
     *            SongAnalytic SA
     * @param p
     *            Position P
     */
    private void printDetails(SongAnalytics songAnalytics, Position p) {
        GUIGlyph temp = new GUIGlyph(songAnalytics, p, legendOption, sortBy);

        // Adds the Glyph to the Window
        window.addShape(temp.getBar1());
        window.addShape(temp.getBar11());
        window.addShape(temp.getBar2());
        window.addShape(temp.getBar22());
        window.addShape(temp.getBar3());
        window.addShape(temp.getBar33());
        window.addShape(temp.getBar4());
        window.addShape(temp.getBar44());
        window.addShape(temp.getDivider());
        window.moveToFront(temp.getDivider());

        window.addShape(temp.getSong());
        window.addShape(temp.getAuth());
        updateLegendBox();
    }


    /**
     * OnClicked for previous - Checks for valid page number
     * 
     * @param button
     *            Previous Button
     */
    public void prevOnClicked(Button button) {
        if (pageNum > 1) {
            pageNum--;
        }
        update();

    }


    /**
     * OnClicked for next - Checks for valid page number
     * 
     * @param button
     *            Next Button
     */
    public void nextOnClicked(Button button) {
        prev.enable();

        if (pageNum < maxPage) {
            pageNum++;
        }
        else if (pageNum > maxPage - 1) {
            next.disable();

        }

        update();

    }


    /**
     * OnClicked for sortArt - Sorts by artist name alfabetically
     * 
     * @param button
     *            Sort Artists Button
     */
    public void sortArtOnClicked(Button button) {
        sortBy = "artist";
        songAnalytics = fileReader.sortBy(songAnalytics, 4);
        pageNum = 1;
        update();

    }


    /**
     * OnClicked for sortTitle - Sorts by title name alfabetically
     * 
     * @param button
     *            Sort By Title Button
     */
    public void sortTitleOnClicked(Button button) {
        sortBy = "title";
        songAnalytics = fileReader.sortBy(songAnalytics, 3);
        pageNum = 1;

        update();
    }


    /**
     * OnClicked for sortYear =- Sorts by year name numerically
     * 
     * @param button
     *            Sort Year Button
     */
    public void sortYrOnClicked(Button button) {
        sortBy = "year";
        songAnalytics = fileReader.sortBy(songAnalytics, 1);
        pageNum = 1;

        update();
    }


    /**
     * OnClicked for sortGenre - Sorts by genre alphabetically
     * 
     * @param button
     *            Sort Genre Button
     */
    public void sortGenreOnClicked(Button button) {
        sortBy = "genre";
        songAnalytics = fileReader.sortBy(songAnalytics, 2);

        pageNum = 1;
        update();
    }


    /**
     * OnClicked for RepHobby - Changes values of each bar based on hobby
     * 
     * @param button
     *            Represent Hobby Button
     */
    public void repHobbyOnClicked(Button button) {
        legendOption = 0;
        update();
        hobbyLegend(legend);

    }


    /**
     * onClicked for repMaj - Changes values of each bar based on hobby -
     * Changes the lengend to represent Majors.
     * 
     * @param button
     *            Represent Major Button
     */
    public void repMajOnClicked(Button button) {
        legendOption = 2;
        update();
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

        updateLegendBox();

    }


    /**
     * OnClicked for RepRegion - Changes the legend to represent regions.
     * 
     * @param button
     *            Represent Region button
     */
    public void repRegOnClicked(Button button) {
        legendOption = 1;
        update();
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

        updateLegendBox();

    }


    /**
     * OnClicked for Quit button - Exits the program.
     * 
     * @param quit
     *            Quit Button
     */
    public void quitOnClicked(Button quit) {
        System.exit(0);
    }


    /**
     * Update - Updates the glyphs in the window.
     */
    private void update() {
        window.removeAllShapes();

        if (pageNum == 1) {
            prev.disable();
        }
        else {
            prev.enable();
        }

        if (pageNum == maxPage) {
            next.disable();
        }
        else {
            next.enable();
        }

        if (songAnalytics.size() >= pageNum * 9) {
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                Position.TOP_LEFT);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                Position.TOP_CNTR);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 2),
                Position.TOP_RIGHT);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 3),
                Position.MID_LEFT);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 4),
                Position.MID_CNTR);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 5),
                Position.MID_RIGHT);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 6),
                Position.BTM_LEFT);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 7),
                Position.BTM_CNTR);
            printDetails(songAnalytics.get(pageNum * 9 - 9 + 8),
                Position.BTM_RIGHT);
        }
        else {
            if (songAnalytics.size() % 9 == 1) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
            }
            else if (songAnalytics.size() % 9 == 2) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                    Position.TOP_CNTR);
            }
            else if (songAnalytics.size() % 9 == 3) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                    Position.TOP_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 2),
                    Position.TOP_RIGHT);
            }
            else if (songAnalytics.size() % 9 == 4) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                    Position.TOP_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 2),
                    Position.TOP_RIGHT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 3),
                    Position.MID_LEFT);
            }
            else if (songAnalytics.size() % 9 == 5) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                    Position.TOP_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 2),
                    Position.TOP_RIGHT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 3),
                    Position.MID_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 4),
                    Position.MID_CNTR);
            }
            else if (songAnalytics.size() % 9 == 6) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                    Position.TOP_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 2),
                    Position.TOP_RIGHT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 3),
                    Position.MID_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 4),
                    Position.MID_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 5),
                    Position.MID_RIGHT);
            }
            else if (songAnalytics.size() % 9 == 7) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                    Position.TOP_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 2),
                    Position.TOP_RIGHT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 3),
                    Position.MID_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 4),
                    Position.MID_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 5),
                    Position.MID_RIGHT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 6),
                    Position.BTM_LEFT);
            }
            else if (songAnalytics.size() % 9 == 8) {
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 0),
                    Position.TOP_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 1),
                    Position.TOP_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 2),
                    Position.TOP_RIGHT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 3),
                    Position.MID_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 4),
                    Position.MID_CNTR);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 5),
                    Position.MID_RIGHT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 6),
                    Position.BTM_LEFT);
                printDetails(songAnalytics.get(pageNum * 9 - 9 + 7),
                    Position.BTM_CNTR);
            }
        }

    }


    /**
     * Update LegendBox - Updates the legend for each option.
     */
    private void updateLegendBox() {
        window.addShape(legend.legendBox);
        window.addShape(legend.legendBox2);
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

}
