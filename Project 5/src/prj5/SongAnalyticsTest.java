// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros
//

package prj5;

import student.TestCase;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */

public class SongAnalyticsTest extends TestCase {

    /**
     * Private Variables
     */
    private SongAnalytics sa;


    /**
     * Sets up any private vairables if needed
     */
    public void setUp() {
        Song song = new Song("All of Me", "John Legend", "2016", "Pop");
        sa = new SongAnalytics(song);
    }


    /**
     * testGetYesPercentageInBuilt
     */
    public void testGetYesPercentageInBuilt() {
        sa.addToTally(1, 1);
        sa.addToTallyTotal(1, 1);
        sa.addToTallyTotal(1, 1);
        sa.subtractFromTallyTotal(1, 1);
        assertEquals(sa.getYesPercentageInBuilt(1, 1), 0);
        sa.addToTallyTotal(1, 0);
        assertEquals(sa.getYesPercentageInBuilt(1, 1), 100);
    }


    /**
     * testGetSong
     */
    public void testGetSong() {
        assertEquals("All of Me", sa.getSong().getTitle());
    }


    /**
     * testGetYesPercentage
     */
    public void testGetYesPercentage() {
        assertEquals(0, sa.getYesPercentage(0, 0, 0));
        assertEquals(0, sa.getYesPercentage(0, 0, 1));
    }


    /**
     * testToStringHobbyPercentage
     */
    public void testToStringHobbyPercentage() {
        assertEquals(sa.toStringHobbyPercentage(),
            "Song Title   : All of Me\r\n" + " Song Artist : John Legend\r\n"
                + " Song Genre  : Pop\r\n" + " Song Year   : 2016\r\n"
                + "Heard : \r\n" + "Reading:0  Art:0  Sports:0  Music:0\r\n"
                + "Likes: \r\n" + "Reading:0  Art:0  Sports:0  Music:0\r\n"
                + "");
    }


    /**
     * testToStringLocationPercentage
     */
    public void testToStringLocationPercentage() {
        assertEquals(sa.toStringLocationPercentage(),
            "Song Title   : All of Me\r\n" + " Song Artist : John Legend\r\n"
                + " Song Genre  : Pop\r\n" + " Song Year   : 2016\r\n"
                + "Heard : \r\n"
                + "Reading : 0  Art : 0  Sports : 0  Music : 0\r\n"
                + "Liked : \r\n"
                + "Reading : 0  Art : 0  Sports : 0  Music : 0\r\n" + "");
    }


    /**
     * testToStringMajorPercentage
     */
    public void testToStringMajorPercentage() {
        assertEquals(sa.toStringMajorPercentage(),
            "Song Title   : All of Me\r\n" + " Song Artist : John Legend\r\n"
                + " Song Genre  : Pop\r\n" + " Song Year   : 2016\r\n"
                + "Heard : \r\n"
                + "Reading : 0  Art : 0  Sports : 0  Music : 0\r\n"
                + "Liked : \r\n"
                + "Reading : 0  Art : 0  Sports : 0  Music : 0\r\n" + "");
    }


    /**
     * testGetLegendPercentagesForSong
     */
    public void testGetLegendPercentagesForSong() {
        assertNull(sa.getLegendPercentagesForSong(85));
        assertNull(sa.getLegendPercentagesForSong(-5));
        assertEquals(sa.getLegendPercentagesForSong(2)[0], 0);
    }


    /**
     * testGetTallyTotal
     */
    public void testGetTallyTotal() {
        assertEquals(sa.getTallyTotal(-1, 0), -1);
        assertEquals(sa.getTallyTotal(0, -1), -1);
        assertEquals(sa.getTallyTotal(-1, -1), -1);
        assertEquals(sa.getTallyTotal(9, 0), -1);
        assertEquals(sa.getTallyTotal(0, 9), -1);
        assertEquals(sa.getTallyTotal(9, 9), -1);
        assertEquals(sa.getTallyTotal(0, 0), 0);
        assertEquals(sa.getTallyTotal(0, 2), 0);
    }

}
