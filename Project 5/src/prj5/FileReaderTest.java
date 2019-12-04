// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros
//

package prj5;

import java.io.FileNotFoundException;
import student.TestCase;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */

public class FileReaderTest extends TestCase {

    /**
     * Private Variable
     */
    FileReader fr;


    /**
     * Sets Up any private variables for testing
     * 
     * @throws FileNotFoundException
     *             Thrown if no file was found.
     */
    public void setUp() throws FileNotFoundException {
        fr = new FileReader("SongList2019F.csv", "MusicSurveyData2019F.csv");
    }


    /**
     * testGetSongs
     * 
     * @throws FileNotFoundException 
     *             Thrown if no file was found.
     */
    public void testGetSongs() throws FileNotFoundException {
        boolean thrown = false;
        FileReader f = null;
        assertNull(f);
        try {
            f = new FileReader("", "");
        }
        catch (FileNotFoundException e) {
            thrown = true;
        }
        assertEquals(thrown, true);

        assertEquals((fr.getSongs().get(0).getAuthor()), "The Sex Pistols");
    }


    /**
     * testGetSongAnalytics
     * 
     * @throws FileNotFoundException
     *             Thrown if no file was found.
     */
    public void testGetSongAnalytics() throws FileNotFoundException {
        assertEquals(fr.getSongAnalytics().get(1).toStringHobbyPercentage(),
            "Song Title   : American Pie\r\n" + " Song Artist : Don McLean\r\n"
                + " Song Genre  : folk rock\r\n" + " Song Year   : 1971\r\n"
                + "Heard : \r\n" + "Reading:58  Art:52  Sports:60  Music:61\r\n"
                + "Likes: \r\n" + "Reading:46  Art:42  Sports:58  Music:51\r\n"
                + "");
    }


    /**
     * testGetSA
     * 
     * @throws FileNotFoundException
     *             Thrown if no file was found.
     */
    public void testGetSA() throws FileNotFoundException {
        assertEquals(fr.getSA()[1].toStringHobbyPercentage(),
            "Song Title   : American Pie\r\n" + " Song Artist : Don McLean\r\n"
                + " Song Genre  : folk rock\r\n" + " Song Year   : 1971\r\n"
                + "Heard : \r\n" + "Reading:58  Art:52  Sports:60  Music:61\r\n"
                + "Likes: \r\n" + "Reading:46  Art:42  Sports:58  Music:51\r\n"
                + "");
    }


    /**
     * testing other stuff
     * 
     * @throws FileNotFoundException
     *             Thrown if no file was found.
     */
    public void testOther() throws FileNotFoundException {
        DLLinkedListNodes<SongAnalytics> s = fr.sortBy(fr.getSongAnalytics(),
            1);
        assertEquals(s.isEmpty(), false);
        Input.main(new String[] { "MusicSurveyData2018HolesLess.csv",
            "SongList2018LessSongs.csv" });
        Input.main(new String[] { "MusicSurveyData2018HolesLess.csv",
            "SongList2018LessSongs.csv", "MusicSurveyData2018HolesLess.csv",
            "SongList2018LessSongs.csv" });
        Input.main(new String[] { "MusicSurveyData2018HolesHalf.csv",
            "SongList2018HalfSongs.csv" });
        Input.main(new String[] { "TestFile.csv",
            "SongList2018HalfSongs.csv" });
    }

}
