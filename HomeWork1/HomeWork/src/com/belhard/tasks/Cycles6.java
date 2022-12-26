package com.belhard.tasks;

public class Cycles6 {
    public static void main(String[] args) {
        int a = 4;// длина
        int b = 2;// ширина
        int c = 1;// сторона квадрата
        if ((a > 0 && b > 0 && c > 0) && (c <= b || c <= a)) {
        int k = 0;
        for (int i = c; i <= a; i += c) {
            k++;
        }
        int kk = b / c;
        k *= kk;
        System.out.println(k);
    }
    }
}
