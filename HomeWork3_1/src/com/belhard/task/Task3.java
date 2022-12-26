package com.belhard.task;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);   //создание сканера для ввода размера массива
        System.out.println("Введите размер массива ");
        int size= scanner.nextInt();
            Scanner maximum=new Scanner(System.in);   //создание сканера для ввода максимального отрезка массива
            System.out.println("Введите МАКС значение отрезка массива ");
            int max= scanner.nextInt();

            Scanner minimum=new Scanner(System.in);   //создание сканера для ввода минимального отрезка массива
            System.out.println("Введите МИНИМ значение отрезка массива ");
            int min= scanner.nextInt();

        int [] array=new int [size]; //создание пустого массива size-массив из сканера

       // рандомное заполнение массива переменные max и min берутся из сканеров ВСЕ ДОЛЖНО быть в одних {}- иначе не работает
        for (int i=0;i<array.length;i++){
            int n= (int)((Math.random()*(max-min)+min));
            array [i]=n;// присвоение массива
            System.out.println(n);
        }

//вывод максимального элемента

        int iMax=0;
        for (int i=0;i<array.length;i++)
            if (array[i]>array[iMax]){
                iMax=i;
        }
        System.out.println("index: "+iMax+ " Value "+array[iMax]);
    }
}
