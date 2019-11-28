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

public class Song {

    /**
     * Private Variables
     */
    private String title;
    private String author;
    private String year;
    private String genre;


    /**
     * Constructor
     * 
     * @param titleString
     *            the song title
     * @param authorString
     *            the author
     * @param genrString
     *            the genre
     * @param yr
     *            the year
     */
    public Song(
        String titleString,
        String authorString,
        String yr,
        String genrString) {
        title = titleString;
        author = authorString;
        year = yr;
        genre = genrString;
    }


    /**
     * Gets the song titles
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Gets the Author
     * 
     * @return the song author
     */
    public String getAuthor() {
        return author;
    }


    /**
     * Gets the song genre
     * 
     * @return the song genre
     */
    public String getGenre() {
        return genre;
    }


    /**
     * Gets the Year
     * 
     * @return the year the song came out
     */
    public String getYear() {
        return year;
    }


    /**
     * Gets to String in the format of Song, author, genre, and year
     * 
     * @return String toString
     */
    public String toString() {
        String answer = null;

        answer = "Song Title   : " + getTitle() + "\n" + " Song Artist : "
            + getAuthor() + "\n" + " Song Genre  : " + getGenre() + "\n"
            + " Song Year   : " + getYear();

        return answer;
    }

}
