package com.belhard.task;

import java.util.Arrays;

public class Task1 {
    public static void main (String [] args){
        int max=99;
        int min=10;
        int [] array=new int [4]; //создание  массива с рандомными числами
        for (int i=0;i<array.length;i++){
            int a=(int)((Math.random())*(max-min)+min);
            System.out.println(a);
            array[i]=a;// добавление элемента в массив
        }
        boolean result=true;// присваиваем переменную для храненения результата сравнения внутри массива
        for (int i=0;i<array.length-1 && result;i++) {
           int a=array[i];//присвоение элемнта массива
           int b=array[i+1];//
            System.out.println("Index="+i);
            System.out.println("a="+a);
            System.out.println("b="+b);
            if (a<b) {
               result=true;
            }
            else {
                result = false;
            } // или resalt= a<b;
        }
        if (result==true){ //  или if (result)
        System.out.println("Мвссив строго возрастающий ");
        }
        else {
            System.out.println("Массив не является строго возрастающем ");
        }



        System.out.println(Arrays.toString(array));// вспомогательный класс для вывода элементов массива в строчку


    }
}
