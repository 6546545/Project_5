package project5;

import java.io.FileNotFoundException;

/**
 * 
 * @author Andy Gould, Dwarakh Nayam, Kevin Kapros
 *
 */
public class Input {

    /**
     * Main
     * 
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length == 2) {
            FileReader FR = new FileReader(args[1], args[0]);
        }
        else {
            FileReader FR = new FileReader("SongList2019F.csv",
                "MusicSurveyData2019F.csv");
        }

    }


}
