// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Andy Gould gandy, Dwarakh Nayam dwarakh, Kevin Kapros kevinkapros
//

package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 * @version 2019.12.3
 */

public class FileReader {

    /**
     * Private Vairables
     */
    private DLLinkedListNodes<Song> songs;
    private DLLinkedListNodes<SongAnalytics> songAnalytics;
    private SongAnalytics[] SA;


    /**
     * Contructor which
     * Calles two methods to read in from two files.
     * Then sends it to sorting
     */
    public FileReader(String fileName1, String fileName2)
        throws FileNotFoundException {
        songs = new DLLinkedListNodes<Song>();
        songsReader(fileName1);
        studentReader(fileName2);

        songAnalytics = copyIntoDLLinked();

        // songAnalytics = sortBy(songAnalytics, 2);
        // for (int i = 0; i < songAnalytics.size(); i++) {
        // SongAnalytics s = songAnalytics.get(i);
        // System.out.println(s.toStringHobbyPercentage());
        // }

        // songAnalytics = sortBy(songAnalytics, 3);
        // for (int i = 0; i < songAnalytics.size(); i++) {
        // SongAnalytics s = songAnalytics.get(i);
        // System.out.println(s.toStringHobbyPercentage());
        // }

    }


    /**
     * songReader - Reads in all the songs and stores each song into it's own
     * Song object
     * 
     * @throws FileNotFoundException
     *             Thrown if no file was found.
     */
    private void songsReader(String fileName1) throws FileNotFoundException {
        String str = "";
        Scanner in = new Scanner(new File(fileName1));

        // The string below gets rid of the first line
        // So we don't process it while creating
        // Song objects from the file read in.

        String getRidOfFirstLine = in.nextLine();
        while (in.hasNextLine()) {
            str = in.nextLine();
            str = str + ",";
            String[] arr = str.split(",");

            // Creates a song object from the file read in.
            // |||
            // |||
            // |||
            // VVVVV
            // VVV
            // V

            Song newSong = new Song(arr[0].trim(), arr[1].trim(), arr[2].trim(),
                arr[3].trim());
            songs.add(songs.size(), newSong);

        }

        SA = new SongAnalytics[songs.size()];
        for (int i = 0; i < songs.size(); i++) {
            SA[i] = new SongAnalytics(songs.get(i));
        }

    }


    /**
     * studentReader - Reads in every student's list of options and adds a
     * tally for every time the person has heard and liked or just heard that
     * song along with their repected major, location, and hobby.
     * The tallies for every song is stored in SongAnalytics
     * 
     * @throws FileNotFoundException
     *             Thrown if no file was found. *
     */
    private void studentReader(String fileName2) throws FileNotFoundException {
        ArrayList<String> studentAnswers = new ArrayList<String>();
        String str = "";
        Scanner in = new Scanner(new File(fileName2));

        // The string below gets rid of the first line
        // So we don't process it while creating
        // Student objects from the file read in.

        String getRidOfFirstLine = in.nextLine();
        int songCounter = 0;
        int lineCounter = 0;
        while (in.hasNextLine()) {
            str = in.nextLine();
            str = str + ",";
            String[] arr = str.split(",");

            int indexJHobby = 0;
            int indexJLocation = 0;
            int indexJMajor = 0;

            // Y Y EEEEEE EEEEEE TTTTTTTTT |
            // Y Y E E T |
            // Y Y E E T |
            // YYY EEEE EEEE T |
            // Y E E T |
            // Y E E T |
            // Y EEEEEE EEEEEE T O

            // major; // [csHeard, csLike, oENGHeard, oENGLike, mathCMDAHeard,
            // mathCMDALike, otherHeard, otherLike]
            if (arr[2].trim().equals("Computer Science")) {
                indexJMajor = 0;
            }
            else if (arr[2].trim().equals("Other Engineering")) {
                indexJMajor = 2;
            }
            else if (arr[2].trim().equals("Math or CMDA")) {
                indexJMajor = 4;
            }
            else if (arr[2].trim().equals("Other")) {
                indexJMajor = 6;
            }
            else {
                indexJMajor = -1;
            }

            // location; // [northEastHeard, northEastLike, outsideUSHeard,
            // outsideUSLike, USHeard, USLike, southEastHeard, southEastLike ]
            if (arr[3].trim().equals("Northeast")) {
                indexJLocation = 0;
            }
            else if (arr[3].trim().equals("Outside of United States")) {
                indexJLocation = 2;
            }
            else if (arr[3].trim().equals(
                "United States (other than Southeast or Northwest)")) {
                indexJLocation = 4;
            }
            else if (arr[3].trim().equals("Southeast")) {
                indexJLocation = 6;
            }
            else {
                indexJLocation = -1;
            }

            // hobby; // [readHeard, readLike, artHeard, artLike, sportsHeard,
            // sportsLike, musicHeard, musicLike]
            if (arr[4].trim().equals("reading")) {
                indexJHobby = 0;
            }
            else if (arr[4].trim().equals("art")) {
                indexJHobby = 2;
            }
            else if (arr[4].trim().equals("sports")) {
                indexJHobby = 4;
            }
            else if (arr[4].trim().equals("music")) {
                indexJHobby = 6;
            }
            else {
                indexJHobby = -1;
            }
            int length = 0;
            if (arr.length % 2 == 1) {
                length = arr.length - 1;
            }
            else {
                length = arr.length;
            }
            for (int column = 5; column < length; column++) {

                if ((column - 5) % 2 == 0) {
                    // Tallies are calculated
                    SA[songCounter].addToTallyTotal(0, indexJHobby / 2);
                    SA[songCounter].addToTallyTotal(1, indexJLocation / 2);
                    SA[songCounter].addToTallyTotal(2, indexJMajor / 2);
                    // Have you heard
                    if (arr[column].trim().equals("Yes")) {
                        if (indexJHobby != -1) {
                            SA[songCounter].addToTally(0, indexJHobby);
                        }
                        if (indexJLocation != -1) {
                            SA[songCounter].addToTally(1, indexJLocation);
                        }
                        if (indexJMajor != -1) {
                            SA[songCounter].addToTally(2, indexJMajor);
                        }
                    }
                    else if (arr[column].trim().equals("")) {
                        SA[songCounter].subtractFromTallyTotal(0, indexJHobby
                            / 2);
                        SA[songCounter].subtractFromTallyTotal(1, indexJLocation
                            / 2);
                        SA[songCounter].subtractFromTallyTotal(2, indexJMajor
                            / 2);
                    }
                    // Do you like
                    if (column != arr.length - 1) {
                        if (arr[column + 1].trim().equals("Yes")) {
                            if (indexJHobby != -1) {
                                SA[songCounter].addToTally(0, indexJHobby + 1);
                            }
                            if (indexJLocation != -1) {
                                SA[songCounter].addToTally(1, indexJLocation
                                    + 1);
                            }
                            if (indexJMajor != -1) {
                                SA[songCounter].addToTally(2, indexJMajor + 1);
                            }
                        }
                    }
                    songCounter++;
                }

            }
            songCounter = 0;

            lineCounter++;
        }

    }


    /**
     * getSongs
     * 
     * @return the songs
     */
    public DLLinkedListNodes<Song> getSongs() {
        return songs;
    }


    /**
     * getSongAnalytics
     * 
     * @return the songAnalytics
     */
    public DLLinkedListNodes<SongAnalytics> getSongAnalytics() {
        return songAnalytics;
    }


    /**
     * getSA
     * 
     * @return SongAnalytics[] sA (Song Analytics)
     */
    public SongAnalytics[] getSA() {
        return SA;
    }


    /**
     * copyIntoDLLinked - Copies every SongAnalytics from the
     * array to a DLLinkedListNodes
     * 
     * @return DLLinkedListNodes<SongAnalytics>
     */
    private DLLinkedListNodes<SongAnalytics> copyIntoDLLinked() {
        DLLinkedListNodes<SongAnalytics> temp =
            new DLLinkedListNodes<SongAnalytics>();
        for (int i = 0; i < SA.length; i++) {
            temp.add(temp.size(), SA[i]);
        }
        return temp;
    }


    /**
     * getDLLLNSongAnalytics - Gets Song Analytics
     * 
     * @return DLLinkedListNodes<SongAnalytics> songAnalytics
     */
    public DLLinkedListNodes<SongAnalytics> getDLLLNSongAnalytics() {
        return songAnalytics;
    }


    /**
     * sortBy - sorts based on year, genre, title, and artist
     * 
     * @param saNodes
     *            The Song Analytics linked list nodes to be sorted
     * @param type
     *            (1 is year, 2 is genre, 3 is title, 4 is artist)
     * @return DLLinkedListNodes<SongAnalytics> finalSA
     */
    public DLLinkedListNodes<SongAnalytics> sortBy(
        DLLinkedListNodes<SongAnalytics> saNodes,
        int type) {

        DLLinkedListNodes<SongAnalytics> finalSA =
            new DLLinkedListNodes<SongAnalytics>();
        int abc = saNodes.size();
        for (int i = 0; i < abc; i++) {
            Iterator<SongAnalytics> localIterator = saNodes.iterator();
            int year = 0;
            String option2 = "";
            String option3 = "";
            int index = 0;
            SongAnalytics highestYearSA = null;
            for (int j = 0; j < saNodes.size(); j++) {

                SongAnalytics songAnalytics = localIterator.next();

                if (type == 1) { // Year
                    int temp = Integer.parseInt(songAnalytics.getSong()
                        .getYear());
                    if (year < temp) {
                        index = j;
                        highestYearSA = songAnalytics;
                        year = temp;
                    }
                }
                else if (type == 2) { // Genre
                    String temp = (songAnalytics.getSong().getGenre())
                        .toLowerCase();
                    if (option2.compareTo(temp) < 0) {
                        index = j;
                        highestYearSA = songAnalytics;
                        option2 = temp;
                    }

                }
                else if (type == 3) { // Title
                    String temp = (songAnalytics.getSong().getTitle())
                        .toLowerCase();
                    if (option3.compareTo(temp) < 0) {
                        index = j;
                        highestYearSA = songAnalytics;
                        option3 = temp;
                    }
                }
                else { // Artist
                    String temp = (songAnalytics.getSong().getAuthor())
                        .toLowerCase();
                    if (option3.compareTo(temp) < 0) {
                        index = j;
                        highestYearSA = songAnalytics;
                        option3 = temp;
                    }
                }

            }
            finalSA.add(0, highestYearSA);
            saNodes.remove(index);
        }
        return finalSA;
    }

}
