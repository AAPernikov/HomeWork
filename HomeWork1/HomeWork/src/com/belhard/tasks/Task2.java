package com.belhard.tasks;

public class Task2 {
    public static void main(String[] args) {
        int dayOfWeek = 6;
        if (dayOfWeek == 1) {
            System.out.println("Понедельник");
        } else if (dayOfWeek == 2) {
            System.out.println("Вторник");
        } else if (dayOfWeek == 3) {
            System.out.println("Среда");
        } else if (dayOfWeek == 4) {
            System.out.println("Четверг");
        } else if (dayOfWeek == 5) {
            System.out.println("Пятница");
        } else if (dayOfWeek == 6) {
            System.out.println("Суббота");
        } else if (dayOfWeek == 7) {
            System.out.println("Воскресень");
        } else {
            System.out.println("такого дня нет");
        }

        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Cуббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("такого дня нет");
        }
    }
}