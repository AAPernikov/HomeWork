package com.belhard.tasks;

public class Cycles5 {
    public static void main(String[] args){
        int a=112;
        int b=5;
        if (a>b) {
            int d = 0;
            for (int i = b; i <= a; i += b) {
                d += b;
            }
            System.out.println(a - d);
        }
    }
}
