package by.belhard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines4 {
    public static void main(String[] str) {
        String value = "ab abab abab abababab bahhh abea";
        String[] array = value.split(" "); //массив слов
        Pattern pattern = Pattern.compile("ab+|ab.+");

        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                System.out.println(word);
            }

        }
    }
}
