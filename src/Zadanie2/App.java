package pl2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Created by kondz on 17.04.2017.
 */
public class App {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner (System.in);
        File myFile = new File ("D:\\ak\\plik.txt");

        if (!myFile.exists()) {
            myFile.createNewFile();
        }
        for (int i=0; i<5; i++) {
            System.out.println("Podaj tekst: ");
            Files.write(myFile.toPath(), (scr.nextLine()+"\r\n").getBytes(), StandardOpenOption.APPEND);
        }
    }

}
