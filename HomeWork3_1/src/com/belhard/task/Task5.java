package com.belhard.task;

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args){
        int [] array= new int[20];
        array [0]=120;
        array [1]=12;
        array [2]=20;
        array [3]=250;
        array [4]=128;
        array [5]=18;
        array [6]=90;
        array [7]=20;
        array [8]=130;
        array [9]=60;
        array [10]=56;
        array [11]=39;
        array [12]=78;
        array [13]=29;
        array [14]=74;
        array [15]=129;
        array [16]=124;
        array [17]=268;
        array [18]=170;
        array [19]=8;
        Scanner scanner=new Scanner(System.in);   //создание сканера для ввода n
        System.out.println("Введите n  ");
        int n= scanner.nextInt();
        int foundIndex = -1;
        for (int i=0; i<=19 && foundIndex==-1;i++) {
            if (array[i]==n)
            {
                foundIndex = i;
            }

        }
        if (foundIndex != -1) {
            System.out.println("найденное число в индексе "+foundIndex);
        } else {
            System.out.println("число не найдено");
        }

    }
}
