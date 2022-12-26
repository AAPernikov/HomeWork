package com.belhard.task;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
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
        for (int i=0;i<array.length;i++);
        // рандомное заполнение массива переменные max и min берутся из сканеров ВСЕ ДОЛЖНО быть в одних {}- иначе не работает
        for (int i=0;i<array.length;i++){
            int n= (int)((Math.random()*(max-min)+min));
            System.out.println(n);
        }


        for (int i=0;i<array.length;i++){    // метод: сортировка "Пузырьком"
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                    //System.out.println(t); //сразу после присвоения
                }
            }
        }System.out.println(Arrays.toString(array));
        }
}
