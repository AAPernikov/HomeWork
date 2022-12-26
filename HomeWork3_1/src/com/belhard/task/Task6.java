package com.belhard.task;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //создание сканера для ввода размера массива
        System.out.println("Введите размер массива ");
        int size = scanner.nextInt();
        Scanner maximum = new Scanner(System.in);   //создание сканера для ввода максимального отрезка массива
        System.out.println("Введите МАКС значение отрезка массива ");
        int max = scanner.nextInt();

        Scanner minimum = new Scanner(System.in);   //создание сканера для ввода минимального отрезка массива
        System.out.println("Введите МИНИМ значение отрезка массива ");
        int min = scanner.nextInt();

        int[] array = new int[size]; //создание пустого массива size-массив из сканера

        // рандомное заполнение массива переменные max и min берутся из сканеров ВСЕ ДОЛЖНО быть в одних {}- иначе не работает
        for (int i = 0; i < array.length; i++) {
            int n = (int) ((Math.random() * (max - min) + min));
            array[i] = n;// присвоение массива
            System.out.println("Массив "+ n);
        }
        for (int i=0;i<array.length/2;i++) {
            int temp=array [i];
            array [i]=array [array.length-i-1];
                array [array.length-i-1]=temp;

            }
        System.out.println("Инвертированный массив ");
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        }
    }
