// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros

package prj5;

import student.TestCase;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */

public class SongTest extends TestCase {

    /**
     * Private Variables
     */
    private Song song;


    /**
     * SetUp any private variables
     */
    public void setUp() {
        String title;
        String author;
        String year;
        String genre;
        title = "Test Title";
        author = "Andy";
        year = "1582";
        genre = "Classical";
        song = new Song(title, author, year, genre);
    }


    /**
     * Test getTitle method
     */
    public void testGetTitle() {
        assertEquals("Test Title", song.getTitle());
    }


    /**
     * Test getAuthor Method
     */
    public void testGetAuthor() {
        assertEquals("Andy", song.getAuthor());
    }


    /**
     * Test getGenre
     */
    public void testGetGenre() {
        assertEquals("Classical", song.getGenre());
    }


    /**
     * test getYear
     */
    public void testGetYear() {
        assertEquals("1582", song.getYear());
    }
}
