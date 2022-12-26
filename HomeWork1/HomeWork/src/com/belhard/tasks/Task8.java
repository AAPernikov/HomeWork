package com.belhard.tasks;

public class Task8 {
    public static void main(String[] args){
        int n=11;
        int m=4;
        if (n>=6 && n<=14){
            switch (n){
                case 6:
                    System.out.print("Шесть ");
                    break;
                case 7:
                    System.out.print("Семь ");
                    break;
                case 8:
                System.out.print("Восемь ");
                break;
                case 9:
                    System.out.print("Девять ");
                    break;
                case 10:
                    System.out.print("Десять ");
                    break;
                case 11:
                    System.out.print("Валет ");
                    break;
                case 12:
                    System.out.print("Дама ");
                    break;
                case 13:
                    System.out.print("Король ");
                    break;
                case 14:
                    System.out.print("Туз ");
                    break;
            }


}
        if (m>=1 && m<=4) {
            switch (m){
                case 1:
                    System.out.println("Пики");
                    break;
                case 2:
                    System.out.println("Трефы");
                    break;
                case 3:
                    System.out.println("Бубны");
                    break;
                case 4:
                    System.out.println("Червы");
                    break;
            }
        }
    }
}
