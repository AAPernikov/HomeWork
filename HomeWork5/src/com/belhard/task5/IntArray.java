package com.belhard.task5;

import java.util.Arrays;

public class IntArray {
    private int [] array;
    public IntArray (int size){
        array=new int[size];
    }
    public IntArray (int [] values){
        array=values;
    }
    public IntArray (){
        array=new int [10];
    }
    public void sort (int number){
        if (number>0){
            for (int i=0; i<array.length; i++){

                for (int j=0;j<array.length-i-1;j++){
                    if (array[j]>array[j+1]){
                        int t=array[j];
                        array [j]=array[j+1];
                        array[j+1]=t;
                    }
                }
            }
        }
        else {
            for (int i=0; i<array.length; i++){

                for (int j=0;j<array.length-i-1;j++){
                    if (array[j]<array[j+1]){
                        int t=array[j];
                        array [j]=array[j+1];
                        array[j+1]=t;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public void addElement (int value,int i) {// метод добавления элемента в массив
        array[i]=value;
    }
    public int getElement (int i){ //метод возвращает элемент из массива
        return array[i];
    }
    public int [] getArray (){//метод возвращает массив
        return array;
    }
}
