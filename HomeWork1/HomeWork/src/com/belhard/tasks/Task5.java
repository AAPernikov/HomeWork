package com.belhard.tasks;

import java.util.concurrent.SynchronousQueue;

public class Task5 {
    public static void main(String[] args){
        int n=3; // 1-+ 2 -- 3- * 4-
     int a=4;
     int b=200;
     if (b>0){
     switch (n) {
         case 1:
             System.out.println(a + b);
             break;
         case 2:
             System.out.println(a - b);
             break;
         case 3:
             System.out.println(a * b);
             break;
         case 4:
             System.out.println(a / b);
             break;
     }
     }
    }
}
