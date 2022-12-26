package com.belhard.tasks;

public class Cycles4 {
    public static void main(String[] args){
        int a=3;
        int b=7;
        if (a<b) {
            int n=0;
            for (int i=a+1;i<b;i++){
                System.out.println(i);
                n++;
            }
            System.out.println("Количество чисел "+n);
        }
    }
}
