package com.belhard.tasks;

public class Cycles8 {
    public static void main(String[] args){
        float deposit=1000;
        int month=7;
        float p= 1.5F;
        if (p>0 && p<25) {
            int k=0;
            for (int i=1;i<=month;i++) {
                float procent= deposit*(p/100);
                deposit=procent+deposit;
                if (deposit<=1100) {

                    k++;

                }

            }System.out.println(k);
        }
        System.out.println(deposit);

        }

    }

