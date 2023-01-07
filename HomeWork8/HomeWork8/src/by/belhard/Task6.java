package by.belhard;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        System.out.println("Введите возраст");
        int age = scanner.nextInt();

        try {
            validate(name, age);
            System.out.println("Валидация прошла успешно ");
        } catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getName());
            System.out.println(ex.getAge());
            ex.printStackTrace();
        }
    }

    private static void validate(String name, int age) throws IncorrectInfoException {
        if (name != null && (name.length() > 200 || !Pattern.matches("[A-Za-zа-яА-я ]+", name))) {
            throw new IncorrectInfoException("Некорректный ФИО ", name,age);
        }

        if (age > 100 || age < 0) {
            throw new IncorrectInfoException("Некорректный возраст ", name, age);
        }
    }
}
