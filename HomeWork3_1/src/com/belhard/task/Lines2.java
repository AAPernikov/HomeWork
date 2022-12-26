package com.belhard.task;

import java.util.Scanner;

public class Lines2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку  ");
        String str = scanner.nextLine();

        System.out.println(str.isEmpty());
        if(str.isEmpty()){
            System.out.println("Введите строку ПРАВИЛЬНО  ");
            str = scanner.nextLine(); // присвоение той же переменной
        }
        System.out.println("Введите a  ");
        String a = scanner.nextLine();
        System.out.println("Введите b ");
        String b = scanner.nextLine();

        char a1=a.charAt(0);// присвоили символ перемен. которую ввели с клавиатуры
        char b1=b.charAt(0);

        String str1=str.replace(a1,b1);// replace(char oldChar, char newChar)
        System.out.println(str1);
    }
}
