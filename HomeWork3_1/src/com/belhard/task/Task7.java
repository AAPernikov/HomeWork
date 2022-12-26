package com.belhard.task;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //создание сканера для ввода размера массива
        System.out.println("Введите размер массива ");
        int n = scanner.nextInt();
        //создание сканера для ввода максимального отрезка массива
        System.out.println("Введите верхний диапазон ");
        int a = scanner.nextInt();

        //создание сканера для ввода минимального отрезка массива
        System.out.println("Введите нижний диапазон ");
        int b = scanner.nextInt();
        //создание пустого массива
        int[] array = new int[n];
        // рандомное заполнение массива переменные
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            int m = (int) ((Math.random() * (a - b) + b));
            array[i] = m;// присвоение массива
            if (i==array.length-1) {
                System.out.println(m);
            } else {
                System.out.print(m+", ");
            }
        }
        System.out.println("Введите число k");
        int value = scanner.nextInt();
        // линейный поиск+

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {

                System.out.println("индекс элемента " + i);
                System.out.println("линейный поиск  " + (i + 1));
               break;
            }
        }
        //for (int i=0;i<array.length;i++){    // метод: сортировка "Пузырьком"
        boolean unsorted=true;
        while(unsorted){
            unsorted=false;
            for (int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                    unsorted=true;
                }
            }
        }



        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
        //  двоичный поиск
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int elementIndex = -1;
        int midIndex;
        int count=0;
        boolean isFound=false;
        while (lowIndex <= highIndex) {
            count++;
            midIndex = (lowIndex + highIndex) / 2;

                    if (value == array[midIndex])
                    {
                        elementIndex = midIndex;
                        isFound=true;
                        System.out.println("Значение найдено, количество шагов - "+count);
                        break;

                    }
                    else if (value < array[midIndex]) {
                             highIndex = midIndex - 1;
                    } else if (value > array[midIndex]) {
                        lowIndex = midIndex + 1;
                    }
        }
        if (!isFound) {
            System.out.println(value + "  отсутствует в массиве");
        }

    }
}
