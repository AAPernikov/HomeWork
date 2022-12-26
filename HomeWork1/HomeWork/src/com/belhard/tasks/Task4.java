package com.belhard.tasks;

public class Task4 {
    public static void main(String[] args){
        int n=1250;
        if (((n%4==0)&&(n%100!=0))||(n%400==0)){
            System.out.println("Високосный год -366 дней");
        } else {
            System.out.println("Обычный год -365 дней");
        }
    }
}
