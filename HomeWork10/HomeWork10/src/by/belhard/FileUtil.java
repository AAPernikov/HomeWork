package by.belhard;

import java.io.*;
import java.util.List;

public class FileUtil {
    public static boolean saveReadersList(List<Reader> readers) {
        try (ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Aleksandr\\file.txt"))) {
            fos.writeUnshared(readers);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public static List<Reader> restoreReadersList() {
        try (ObjectInputStream fis = new ObjectInputStream(new FileInputStream("C:\\Users\\Aleksandr\\file.txt"))) {
            List<Reader> readers = (List<Reader>) fis.readObject();
            return readers;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
