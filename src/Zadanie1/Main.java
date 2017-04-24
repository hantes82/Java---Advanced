package pl;

import java.io.File;
import java.io.IOException;

/**
 * Created by kondz on 17.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        File myFolder = new File("D:\\ak\\");
        File myFile = new File("D:\\ak\\akademia.kodu");

        myFolder.mkdirs();
        try {

            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (myFile.exists()) {
            System.out.println("ISTNIEJE");
        }

    }
}

