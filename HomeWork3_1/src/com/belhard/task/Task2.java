package com.belhard.task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // создание переменной типа сканера,чтобы ввести ввести с клавиатуры число,пока не введем массив не запустится
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        if (size<=0){
            System.out.println("Введите корректный размер массива");
            size = scanner.nextInt();
        }
            Scanner max = new Scanner(System.in);
            System.out.println("MAX");
            int maximym = scanner.nextInt();
            if (maximym<0){
                System.out.println("не соответствует MAX");
                maximym = scanner.nextInt();
            }

            Scanner min = new Scanner(System.in);
            System.out.println("MIN");
            int minimym = scanner.nextInt();
            if (minimym<=0 || minimym>=maximym){
                System.out.println("не соответствует MIN");
                minimym = scanner.nextInt();
            }


        int [] array=new int [size]; //создание пустого массива


        // рандомное заполнение массива

        for (int i=0;i<array.length;i++){
            int n= (int)((Math.random()*(maximym-minimym)+minimym));
            System.out.println(n);
            array[i]=n;
        }
    }
}

