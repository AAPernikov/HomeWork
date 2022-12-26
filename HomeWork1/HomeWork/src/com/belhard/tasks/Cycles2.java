package com.belhard.tasks;

public class Cycles2 {
    public static void main(String[] args){
        int t=1;
        do {
            if (t%5==0){
            System.out.println(t);}
            t++;
        }
        while (t<=100);
    }
}
