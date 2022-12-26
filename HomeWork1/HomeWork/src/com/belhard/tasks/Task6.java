package com.belhard.tasks;

public class Task6 {
    public static void main(String[] args) {
        int a=597;
        if ( a%2==0){
            System.out.print("четное ");
        } else {
            System.out.print("нечетное ");
        }
        if (a/10==0){
            System.out.println("однозначное число ");
        }else {
            if (a/100==0){
                System.out.println("двузначное число ");
            }
            else {
                System.out.println("трехзначное число ");
            }
        }

    }
}
