package by.belhard;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileUtil {
    public static boolean saveReadersList(List<Reader> readers) {
        StringBuilder builder = new StringBuilder();
        for (Reader reader : readers) {
            if (reader != null) {
                String readerStr = reader.toString();
                builder.append(readerStr);
            }
        }

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Aleksandr\\file.txt")) {
            String text = builder.toString();
            byte[] buffer = text.getBytes();
            fos.write(buffer);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }
}
