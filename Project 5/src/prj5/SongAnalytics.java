// Virginia Tech Honor Code Pledge:

//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros

package prj5;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */

public class SongAnalytics {

    /**
     * Private Variables
     */
    private Song song;
    private int[][] tallyYes = new int[3][8];
    private int[][] tallyTotal = new int[3][4];


    /**
     * Constructor
     * 
     * @param song
     *            The song
     */
    public SongAnalytics(Song song) {
        this.song = song;
    }


    /**
     * addToTally - adds one to tally to a specific location
     * 
     * @param i
     *            row value
     * @param j
     *            column value
     */
    public void addToTally(int i, int j) {
        tallyYes[i][j] = tallyYes[i][j] + 1;
    }


    /**
     * addToTallyTotal - adds one to tallyTotal to a specific location
     * 
     * @param i
     *            row value
     * @param j
     *            column value
     */
    public void addToTallyTotal(int i, int j) {
        tallyTotal[i][j] = tallyTotal[i][j] + 1;
    }


    /**
     * subtractFromTallyTotal -
     * subtracts one from tallyTotal from a specific location
     * 
     * @param i
     *            row value
     * @param j
     *            column value
     */
    public void subtractFromTallyTotal(int i, int j) {
        tallyTotal[i][j] = tallyTotal[i][j] - 1;
    }


    /**
     * getSong
     * 
     * @return Returns the song
     */
    public Song getSong() {
        return song;
    }


    /**
     * getYesPercentage
     * 
     * @param i
     *            row value
     * @param j
     *            column value
     * @param total
     *            d
     * @return d
     */
    public int getYesPercentage(int i, int j, int total) {
        if (total == 0) {
            return 0;
        }
        return ((tallyYes[i][j] * 100) / total);
    }


    /**
     * getYesPercentageInBuilt
     * 
     * @param i
     *            row value
     * @param j
     *            column value
     *
     * @return d
     */
    public int getYesPercentageInBuilt(int i, int j) {

        if (tallyTotal[i][j / 2] == 0) {
            return 0;
        }
        return ((tallyYes[i][j] * 100) / tallyTotal[i][j / 2]);
    }


    /**
     * toStringHobbyPercentage
     * 
     * @return String s
     */
    public String toStringHobbyPercentage() {
        String answer = null;
        int readingYP = getYesPercentage(0, 0, tallyTotal[0][0]);
        int artYP = getYesPercentage(0, 2, tallyTotal[0][1]);
        int sportsYP = getYesPercentage(0, 4, tallyTotal[0][2]);
        int musicYP = getYesPercentage(0, 6, tallyTotal[0][3]);

        int readingYPLiked = getYesPercentage(0, 1, tallyTotal[0][0]);
        int artYPLiked = getYesPercentage(0, 3, tallyTotal[0][1]);
        int sportsYPLiked = getYesPercentage(0, 5, tallyTotal[0][2]);
        int musicYPLiked = getYesPercentage(0, 7, tallyTotal[0][3]);

        answer = song.toString();
        answer += "\n" + "Heard : " + "\n";
        answer += "Reading:" + readingYP + "  Art:" + artYP + "  Sports:"
            + sportsYP + "  Music:" + musicYP + "\n";
        answer += "Likes: " + "\n";
        answer += "Reading:" + readingYPLiked + "  Art:" + artYPLiked
            + "  Sports:" + sportsYPLiked + "  Music:" + musicYPLiked + "\n";

        return answer;
    }


    /**
     * toStringLocationPercentage
     * 
     * @return String
     */
    public String toStringLocationPercentage() {
        String answer = null;
        int readingYP = getYesPercentage(1, 0, tallyTotal[1][0]);
        int artYP = getYesPercentage(1, 2, tallyTotal[1][1]);
        int sportsYP = getYesPercentage(1, 4, tallyTotal[1][2]);
        int musicYP = getYesPercentage(1, 6, tallyTotal[1][3]);

        int readingYPLiked = getYesPercentage(1, 1, tallyTotal[1][0]);
        int artYPLiked = getYesPercentage(1, 3, tallyTotal[1][1]);
        int sportsYPLiked = getYesPercentage(1, 5, tallyTotal[1][2]);
        int musicYPLiked = getYesPercentage(1, 7, tallyTotal[1][3]);

        answer = song.toString();
        answer += "\n" + "Heard : " + "\n";
        answer += "Reading : " + readingYP + "  Art : " + artYP + "  Sports : "
            + sportsYP + "  Music : " + musicYP + "\n";
        answer += "Liked : " + "\n";
        answer += "Reading : " + readingYPLiked + "  Art : " + artYPLiked
            + "  Sports : " + sportsYPLiked + "  Music : " + musicYPLiked
            + "\n";

        return answer;
    }


    /**
     * toStringMajorPercentage
     * 
     * @return String s
     */
    public String toStringMajorPercentage() {
        String answer = null;
        int readingYP = getYesPercentage(3, 0, tallyTotal[2][0]);
        int artYP = getYesPercentage(3, 2, tallyTotal[2][1]);
        int sportsYP = getYesPercentage(3, 4, tallyTotal[2][2]);
        int musicYP = getYesPercentage(3, 6, tallyTotal[2][3]);

        int readingYPLiked = getYesPercentage(3, 1, tallyTotal[2][0]);
        int artYPLiked = getYesPercentage(3, 3, tallyTotal[2][1]);
        int sportsYPLiked = getYesPercentage(3, 5, tallyTotal[2][2]);
        int musicYPLiked = getYesPercentage(3, 7, tallyTotal[2][3]);

        answer = song.toString();
        answer += "\n" + "Heard : " + "\n";
        answer += "Reading : " + readingYP + "  Art : " + artYP + "  Sports : "
            + sportsYP + "  Music : " + musicYP + "\n";
        answer += "Liked : " + "\n";
        answer += "Reading : " + readingYPLiked + "  Art : " + artYPLiked
            + "  Sports : " + sportsYPLiked + "  Music : " + musicYPLiked
            + "\n";

        return answer;
    }


    /**
     * getLegendPercentagesForSong
     * 
     * @param i
     *            ==> 1 = hobby, 2 = location, 3 = major
     * @return Array of the values for that legend title
     *         [option 1, option 1, option 2, option 2, option 3, option 3,
     *         option 4, option 4]
     */
    public int[] getLegendPercentagesForSong(int i) {
        if (i > 0 && i < 4) {
            return new int[] { getYesPercentageInBuilt(i - 1, 0),
                getYesPercentageInBuilt(i - 1, 1), getYesPercentageInBuilt(i
                    - 1, 2), getYesPercentageInBuilt(i - 1, 3),
                getYesPercentageInBuilt(i - 1, 4), getYesPercentageInBuilt(i
                    - 1, 5), getYesPercentageInBuilt(i - 1, 6),
                getYesPercentageInBuilt(i - 1, 7) };
        }
        return null;
    }


    /**
     * getTallyTotal
     * 
     * @param i
     *            row value
     * @param j
     *            column value
     * 
     * @return Number of the Tally Total
     */
    public int getTallyTotal(int i, int j) {
        if (i < 3 && i > -1 && j < 4 && j > -1) {
            return tallyTotal[i][j];
        }
        return -1;
    }

}
