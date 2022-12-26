package com.belhard.task;

import java.util.Scanner;

public class Lines1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку  ");
        String str = scanner.nextLine();

        System.out.println("Введите символ  ");
        String simvol= scanner.nextLine();

        int count=0;
        char [] text=str.toCharArray();// toCharArray() переводим строки в массив
        char s=simvol.charAt(0); // charAt-возвращает символ из строки
        for (int i=0;i<text.length;i++){

            if (text[i]==s){
                count++;
            }
        }
        System.out.println("Количество вхождений "+ count);

    }
}
