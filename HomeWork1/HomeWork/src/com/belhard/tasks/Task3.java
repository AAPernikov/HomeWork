package com.belhard.tasks;

public class Task3 {
    public static void main(String[] args){
        int a=50;
        int b=58;
        int c=51;
        if (a<b && b<c){
            System.out.println(b+c);
        } else if (b<a && a<c) {
            System.out.println (a+c);
        }else {
            System.out.println(a+b);
        }
    }
}
