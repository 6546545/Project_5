package project5;

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
public class SongAnalytics {

    /**
     * Private Variables
     */
    private Song song;
    private int[] hobby; // [readHeard, readLike, artHeard, artLike,
                         // sportsHeard, sportsLike, musicHeard, musicLike]
    private int[] location; // [csHeard, csLike, oENGHeard, oENGLike,
                            // mathCMDAHeard, mathCMDALike, otherHeard,
                            // otherLike]
    private int[] major; // [northEastHeard, northEastLike, outsideUSHeard,
                         // outsideUSLike, USHeard, USLike, southEastHeard,
                         // southEastLike ]
    private int[][] tallyYes = new int[3][8];
// private int[][] tallyTotal = new int[3][8];


    // hobby => [readHeard , readLike, artHeard, artLike, sportsHeard,
    // sportsLike, musicHeard, musicLike]
    // location => [csHeard , csLike, oENGHeard, oENGLike, mathCMDAHeard,
    // mathCMDALike, otherHeard, otherLike]
    // major => [northEastHeard , northEastLike, outsideUSHeard, outsideUSLike,
    // USHeard, USLike, southEastHeard, southEastLike ]
    /**
     * Constructor
     * 
     * @param song
     *            The song
     * @param hobby
     *            The Hobby details for each song survey data
     * @param location
     *            The Location details for each song survey data
     * @param major
     *            The Major details for each song survey data
     */
    public SongAnalytics(Song song) { // int[] hobby, int[] location, int[]
                                      // major) {
        this.song = song;
        // this.hobby = hobby;
        // this.location = location;
        // this.major = major;
    }


    public void addToTally(int i, int j) {
        tallyYes[i][j] = tallyYes[i][j] + 1;
    }


    public void print() {
// System.out.println(Arrays.toString(tally));
        System.out.println(song.getTitle());
        for (int i = 0; i < 3; i++) {
            System.out.println(tallyYes[i][0] + " " + tallyYes[i][0] + " "
                + tallyYes[i][1] + " " + tallyYes[i][2] + " " + tallyYes[i][3]
                + " " + tallyYes[i][4] + " " + tallyYes[i][5] + " "
                + tallyYes[i][6] + " " + tallyYes[i][7]);
        }

    }

    public Song getSong() {
        return song;
    }


    public int getYesPercentage(int i, int j, int total) {
        if (total == 0) {
            return 0;
        }
        return ((tallyYes[i][j] * 100) / total);
    }

}
