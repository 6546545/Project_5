package project5;

import java.io.FileNotFoundException;
import student.TestCase;

public class FileReaderTest extends TestCase {
    private DLLinkedListNodes<Song> songs;
    private DLLinkedListNodes<Student> students;
    private DLLinkedListNodes<SongAnalytics> songAnalytics;
    private SongAnalytics[] SA;
    private FileReader fr;


    public void setUp() throws FileNotFoundException {
        songs = new DLLinkedListNodes<Song>();
        students = new DLLinkedListNodes<Student>();
        songAnalytics = new DLLinkedListNodes<SongAnalytics>();
        SA = new SongAnalytics[] {};
        fr = new FileReader("SongList2019F.csv", "MusicSurveyData2019F.csv");
    }


    public void testSongsReader() {

    }


    public void testStudentReader() {

    }
}
