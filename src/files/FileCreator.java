package files;

import java.io.File;
import java.io.IOException;

/**
 * Created by kondz on 02.05.2017.
 */
public class FileCreator {
    public static void main(String[] args) throws IOException {
        String  filename = "D:/aaa/plik.txt";
        String dirname = "D:/aaa";
        File file = new File(filename);

        File dir = new File (dirname);
        boolean fileExists = file.exists();
        boolean dirExists = dir.exists();
        if (!dirExists) {

        dirExists = dir.mkdir();


    }
        if (!fileExists) {
            fileExists = file.createNewFile();

        }
    }
}
