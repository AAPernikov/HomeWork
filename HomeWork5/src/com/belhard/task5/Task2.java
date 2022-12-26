package com.belhard.task5;

import java.util.Arrays;

public class Task2 {
    public static void main (String[] args){
        IntArray y=new IntArray();
        y.addElement(10,0);
        y.addElement(15,1);
        y.addElement(15,2);
        y.addElement(17,3);
        y.addElement(19,4);
        printArray(y.getArray());

        int [] array={1,9,8,6,2,3,7,4,6,88,999};
        IntArray x=new IntArray(array);
        x.sort(6);
        x.sort(-9);
    }
    private static void printArray(int [] array){
        System.out.println(Arrays.toString(array));
    }

}
