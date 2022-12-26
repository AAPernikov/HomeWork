package com.belhard.task3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // создание переменной типа сканера,чтобы ввести ввести с клавиатуры число,пока не введем массив не запустится
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();

        int [] array=new int [size]; //создание пустого массива
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int max =20; // рандомное заполнение массива
        int min=10;
        for (int i=0;i<array.length;i++){
            int n= (int)((Math.random()*(max-min)+min));
            System.out.println(n);
        }
    }
}
