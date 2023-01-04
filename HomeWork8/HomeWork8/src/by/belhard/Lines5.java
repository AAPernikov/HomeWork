package by.belhard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines5 {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату");
        String date = scanner.nextLine();

        String yearStr=date.substring(0,4);
        int year=Integer.parseInt(yearStr);
        if (year<1000 || year>2012) {
            System.out.println("Неправильно введен год");
            return;
        }
        String dayStr=date.substring(8,10);
        int day=Integer.parseInt (dayStr);
        if (day<1 || day>30) {
            System.out.println("Неправильно введен день");
            return;
        }

        Pattern pattern = Pattern.compile("([12][0-9][0-9][0-9])/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])");
        Matcher matcher = pattern.matcher(date);
        System.out.println(matcher.matches());
    }
}

