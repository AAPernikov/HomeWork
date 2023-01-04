package by.belhard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines2 {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ссылку");
        String url = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(https?:\\/\\/)?([\\w-]{1,32}\\.com)[^\\s@]*$");
        Matcher matcher = pattern.matcher(url);
        System.out.println(matcher.matches());
    }
}
