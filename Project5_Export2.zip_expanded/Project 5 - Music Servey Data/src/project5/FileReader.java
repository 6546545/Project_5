package project5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileReader {

    /**
     * 
     */
    private DLLinkedListNodes<Song> songs;
    private DLLinkedListNodes<Student> students;
    private DLLinkedListNodes<SongAnalytics> songAnalytics;
    private SongAnalytics[] SA;
    private int[][] TotalNumber = new int[3][4];


    /**
     * 
     */
    public FileReader(String fileName1, String fileName2)//
        throws FileNotFoundException {
        songs = new DLLinkedListNodes<Song>();
        students = new DLLinkedListNodes<Student>();
        songAnalytics = new DLLinkedListNodes<SongAnalytics>();
        songsReader(fileName1);
        studentReader(fileName2);
        for (int i = 0; i < songs.size(); i++) {
        }
        int i = 0;
        i = 0;
// System.out.println("Song Title : " + SA[i].getSong().getTitle());
// System.out.println("Song Artist : " + SA[i].getSong().getAuthor());
// System.out.println("Song Genre : " + SA[i].getSong().getYear());
// System.out.println("Song Year : " + SA[i].getSong().getGenre());
// System.out.println("Heard : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 0,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 2,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 4,
// TotalNumber[0][2]) + " Music" + SA[i]
// .getYesPercentage(0, 6, TotalNumber[0][3]));
// System.out.println("Likes : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 1,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 3,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 5,
// TotalNumber[0][2]) + " Music" + SA[i]
// .getYesPercentage(0, 7, TotalNumber[0][3]));
// System.out.println(" ");
// i = 2;
// System.out.println("Song Title : " + SA[i].getSong().getTitle());
// System.out.println("Song Artist : " + SA[i].getSong().getAuthor());
// System.out.println("Song Genre : " + SA[i].getSong().getYear());
// System.out.println("Song Year : " + SA[i].getSong().getGenre());
// System.out.println("Heard : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 0,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 2,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 4,
// TotalNumber[0][2]) + " Music" + SA[i]
// .getYesPercentage(0, 6, TotalNumber[0][3]));
// System.out.println("Likes : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 1,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 3,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 5,
// TotalNumber[0][2]) + " Music" + SA[i]
// .getYesPercentage(0, 7, TotalNumber[0][3]));
// System.out.println(" ");
// i = 1;
// System.out.println("Song Title : " + SA[i].getSong().getTitle());
// System.out.println("Song Artist : " + SA[i].getSong().getAuthor());
// System.out.println("Song Genre : " + SA[i].getSong().getYear());
// System.out.println("Song Year : " + SA[i].getSong().getGenre());
// System.out.println("Heard : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 0,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 2,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 4,
// TotalNumber[0][2]) + " Music" + SA[i]
// .getYesPercentage(0, 6, TotalNumber[0][3]));
// System.out.println("Likes : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 1,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 3,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 5,
// TotalNumber[0][2]) + " Music" + SA[i]
// .getYesPercentage(0, 7, TotalNumber[0][3]));
// System.out.println(" ");
// // -------------------------------------------------------------------------
// // FUCK UP POINT
// i = 1;
// System.out.println("Song Title : " + SA[i].getSong().getTitle());
// System.out.println("Song Artist : " + SA[i].getSong().getAuthor());
// System.out.println("Song Genre : " + SA[i].getSong().getYear());
// System.out.println("Song Year : " + SA[i].getSong().getGenre());
// System.out.println("Heard : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 0,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 2,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 4,
// TotalNumber[0][2]) + " Music" + SA[i].getYesPercentage(0, 6,
// TotalNumber[0][3]));
// System.out.println("Likes : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 1,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 3,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 5,
// TotalNumber[0][2]) + " Music" + SA[i].getYesPercentage(0, 7,
// TotalNumber[0][3]));
// System.out.println(" ");
// i = 0;
// System.out.println("Song Title : " + SA[i].getSong().getTitle());
// System.out.println("Song Artist : " + SA[i].getSong().getAuthor());
// System.out.println("Song Genre : " + SA[i].getSong().getYear());
// System.out.println("Song Year : " + SA[i].getSong().getGenre());
// System.out.println("Heard : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 0,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 2,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 4,
// TotalNumber[0][2]) + " Music" + SA[i].getYesPercentage(0, 6,
// TotalNumber[0][3]));
// System.out.println("Likes : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 1,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 3,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 5,
// TotalNumber[0][2]) + " Music" + SA[i].getYesPercentage(0, 7,
// TotalNumber[0][3]));
// System.out.println(" ");
// i = 2;
// System.out.println("Song Title : " + SA[i].getSong().getTitle());
// System.out.println("Song Artist : " + SA[i].getSong().getAuthor());
// System.out.println("Song Genre : " + SA[i].getSong().getYear());
// System.out.println("Song Year : " + SA[i].getSong().getGenre());
// System.out.println("Heard : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 0,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 2,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 4,
// TotalNumber[0][2]) + " Music" + SA[i].getYesPercentage(0, 6,
// TotalNumber[0][3]));
// System.out.println("Likes : ");
// System.out.println("Reading" + SA[i].getYesPercentage(0, 1,
// TotalNumber[0][0]) + " Art" + SA[i].getYesPercentage(0, 3,
// TotalNumber[0][1]) + " Sports" + SA[i].getYesPercentage(0, 5,
// TotalNumber[0][2]) + " Music" + SA[i].getYesPercentage(0, 7,
// TotalNumber[0][3]));
// System.out.println(" ");


    }


    /**
     * @throws FileNotFoundException
     * 
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
            // |
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
     * @throws FileNotFoundException
     * 
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

            
            // major; // [csHeard, csLike, oENGHeard, oENGLike, mathCMDAHeard,
            // mathCMDALike, otherHeard, otherLike]
            if (arr[2].trim().equals("Computer Science")) {
                indexJMajor = 0;
                TotalNumber[2][0] = TotalNumber[2][0] + 1;
            }
            else if (arr[2].trim().equals("Other Engineering")) {
                indexJMajor = 2;
                TotalNumber[2][1] = TotalNumber[2][1] + 1;
            }
            else if (arr[2].trim().equals("Math or CMDA")) {
                indexJMajor = 4;
                TotalNumber[2][2] = TotalNumber[2][2] + 1;
            }
            else if (arr[2].trim().equals("Other")) {
                indexJMajor = 6;
                TotalNumber[2][3] = TotalNumber[2][3] + 1;
            }
            else {
                indexJMajor = -1;
            }

            // location; // [northEastHeard, northEastLike, outsideUSHeard,
            // outsideUSLike, USHeard, USLike, southEastHeard, southEastLike ]
            if (arr[3].trim().equals("Northeast")) {
                indexJLocation = 0;
                TotalNumber[1][0] = TotalNumber[1][0] + 1;
            }
            else if (arr[3].trim().equals("Outside of United States")) {
                indexJLocation = 2;
                TotalNumber[1][1] = TotalNumber[1][1] + 1;
            }
            else if (arr[3].trim().equals(
                "United States (other than Southeast or Northwest)")) {
                indexJLocation = 4;
                TotalNumber[1][2] = TotalNumber[1][2] + 1;
            }
            else if (arr[3].trim().equals("Southeast")) {
                indexJLocation = 6;
                TotalNumber[1][3] = TotalNumber[1][3] + 1;
            }
            else {
                indexJLocation = -1;
            }

            // hobby; // [readHeard, readLike, artHeard, artLike, sportsHeard,
            // sportsLike, musicHeard, musicLike]
            if (arr[4].trim().equals("reading")) {
                indexJHobby = 0;
                TotalNumber[0][0] = TotalNumber[0][0] + 1;
            }
            else if (arr[4].trim().equals("art")) {
                indexJHobby = 2;
                TotalNumber[0][1] = TotalNumber[0][1] + 1;
            }
            else if (arr[4].trim().equals("sports")) {
                indexJHobby = 4;
                TotalNumber[0][2] = TotalNumber[0][2] + 1;
            }
            else if (arr[4].trim().equals("music")) {
                indexJHobby = 6;
                TotalNumber[0][3] = TotalNumber[0][3] + 1;
            }
            else {
                indexJHobby = -1;
            }

// System.out.println(lineCounter + " ");

            for (int column = 5; column < arr.length; column++) {
                if ((column - 5) % 2 == 0 && songCounter < songs.size()) {
// System.out.println("Column : " + column);
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
// SA[songCounter].addToTallyTotal(0, indexJHobby);
// SA[songCounter].addToTallyTotal(1, indexJLocation);
// SA[songCounter].addToTallyTotal(2, indexJMajor);
                    }
                    // Do you like
                    if (arr[column + 1].trim().equals("Yes")) {
                        if (indexJHobby != -1) {
                            SA[songCounter].addToTally(0, indexJHobby + 1);
                        }
                        if (indexJLocation != -1) {
                            SA[songCounter].addToTally(1, indexJLocation + 1);
                        }
                        if (indexJMajor != -1) {
                            SA[songCounter].addToTally(2, indexJMajor + 1);
                        }
                    }
                    songCounter++;
                }

            }
            songCounter = 0;

// if (arr[5].trim().equals("Yes")) {
// if (indexJHobby != -1) {
// SA[0].addToTally(0, indexJHobby);
// }
// if (indexJLocation != -1) {
// SA[0].addToTally(1, indexJLocation);
// }
// if (indexJMajor != -1) {
// SA[0].addToTally(2, indexJMajor);
// }
// }
// // Do you like
// if (arr[6].trim().equals("Yes")) {
// if (indexJHobby != -1) {
// SA[0].addToTally(0, indexJHobby + 1);
// }
// if (indexJLocation != -1) {
// SA[0].addToTally(1, indexJLocation + 1);
// }
// if (indexJMajor != -1) {
// SA[0].addToTally(2, indexJMajor + 1);
// }
// }
// if (arr[7].trim().equals("Yes")) {
// if (indexJHobby != -1) {
// SA[1].addToTally(0, indexJHobby);
// }
// if (indexJLocation != -1) {
// SA[1].addToTally(1, indexJLocation);
// }
// if (indexJMajor != -1) {
// SA[1].addToTally(2, indexJMajor);
// }
// }
// // Do you like
// if (arr[8].trim().equals("Yes")) {
// if (indexJHobby != -1) {
// SA[1].addToTally(0, indexJHobby + 1);
// }
// if (indexJLocation != -1) {
// SA[1].addToTally(1, indexJLocation + 1);
// }
// if (indexJMajor != -1) {
// SA[1].addToTally(2, indexJMajor + 1);
// }
// }
//

// for (int column = 0; column < arr.length; column++) {
// if ((column - 5) % 2 == 0 && songCounter < songs.size()) {
//
// songCounter++;
// // songs.getElementAt(songCounter);
// // Get Tally of Yes
// // Have you Heard
// if (arr[column].trim().equals("Yes")) {
// if (indexJHobby != -1) {
// SA[songCounter - 1].addToTally(0, indexJHobby);
// }
// if (indexJLocation != -1) {
// SA[songCounter - 1].addToTally(1, indexJLocation);
// }
// if (indexJMajor != -1) {
// SA[songCounter - 1].addToTally(2, indexJMajor);
// }
// }
// // Do you like
// if (arr[column + 1].trim().equals("Yes")) {
// if (indexJHobby != -1) {
// SA[songCounter - 1].addToTally(0, indexJHobby + 1);
// }
// if (indexJLocation != -1) {
// SA[songCounter - 1].addToTally(1, indexJLocation
// + 1);
// }
// if (indexJMajor != -1) {
// SA[songCounter - 1].addToTally(2, indexJMajor + 1);
// }
// }
// }
//
// }
                
            songCounter = 0;

            // All of the student answers
            // begin on the 5th element
            // of arr.
            for (int j = 5; j < arr.length - 1; j++) {
                studentAnswers.add(arr[j]);
            }

            // Skip the first cells in the .csv to
            // only use information regarding a student.

            Student newStudent = new Student(arr[2].trim(), arr[3].trim(),
                arr[4].trim(), studentAnswers);
            students.add(0, newStudent);

            // hobby; // [readHeard, readLike, artHeard, artLike, sportsHeard,
            // sportsLike, musicHeard, musicLike]
            // location; // [csHeard, csLike, oENGHeard, oENGLike,
            // mathCMDAHeard, mathCMDALike, otherHeard, otherLike]
            // major; // [northEastHeard, northEastLike, outsideUSHeard,
            // outsideUSLike, USHeard, USLike, southEastHeard, southEastLike ]
// hobby = new int[]{hReadHeard, hReadLike, hArtHeard, hArtLike, hSportsHeard,
// hSportsLike, hMusicHeard, hMusicLike};
// location = new int[]{lCSHeard, lCSLike, lENGHeard, lENGLike, lMathCMDAHeard,
// lMathCMDALike, lOtherHeard, lOtherLike};
// major = new int[]{mNEHeard, mNELike, mOutUSHeard, mOutUSLike, mUSHeard,
// mUSLike, mSEHeard, mSELike};
        lineCounter++;
        }
        
        


    }


    /**
     * @return the songs
     */
    public DLLinkedListNodes<Song> getSongs() {
        return songs;
    }



    /**
     * @return the students
     */
    public DLLinkedListNodes<Student> getStudents() {
        return students;
    }



    /**
     * @return the songAnalytics
     */
    public DLLinkedListNodes<SongAnalytics> getSongAnalytics() {
        return songAnalytics;
    }



    /**
     * @return the sA
     */
    public SongAnalytics[] getSA() {
        return SA;
    }



    /**
     * @return the totalNumber
     */
    public int[][] getTotalNumber() {
        return TotalNumber;
    }


    



    private DLLinkedListNodes<SongAnalytics> copyIntoDLLinked() {
        DLLinkedListNodes<SongAnalytics> temp =
            new DLLinkedListNodes<SongAnalytics>();
        for (int i = 0; i < SA.length; i++) {
            temp.add(temp.size(), SA[i]);
        }
        return temp;
    }


    private void sortByYear(DLLinkedListNodes<SongAnalytics> saNodes) {
        Iterator<SongAnalytics> localIterator = saNodes.iterator();

    }

}
