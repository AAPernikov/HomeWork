package by.belhard;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Users\\Aleksandr\\Desktop\\BelHard\\HomeWorkGitHub\\HomeWork\\HomeWork10\\HomeWork10\\src\\resources");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Aleksandr\\result.txt",true);
        for (File file : folder.listFiles()) {
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fos.write(buffer);
        }
    }

}
