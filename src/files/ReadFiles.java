package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by kondz on 02.05.2017.
 */
public class ReadFiles {
    public static void main(String[] args) {
        String filename = "D:/aaa/plik.txt";
        File file = new File (filename);
        int lines = 0;
        try {
            Scanner scr = new Scanner (file);
            while (scr.hasNextLine()) {
                String read = scr.nextLine();
                System.out.println(read);
                lines++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Linii w pliku: " + lines);
    }

}
