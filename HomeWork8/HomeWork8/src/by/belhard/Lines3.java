package by.belhard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines3 {
    public static void main(String[] str) {
        String value = "ahb acb aeb aeeb adcb axeb";
        String[] array = value.split(" "); //массив слов
        Pattern pattern = Pattern.compile("(^a.b$)");

        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                System.out.println(word);
            }

        }

    }
}
