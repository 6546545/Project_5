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
     * @param year
     *            when the song was made
     */
    public Song(
        String titleString,
        String authorString,
        String genrString,
        String yr) {
        title = titleString;
        author = authorString;
        genre = genrString;
        year = yr;
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
     * Gets the song gener
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

}
