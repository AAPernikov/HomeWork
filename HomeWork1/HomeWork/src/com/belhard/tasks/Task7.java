package com.belhard.tasks;

public class Task7 {
    public static void main(String[] args){
        int d=22;
        int m=10;
        if ((d>=20 && m==1) ||(d<=18 && m==2)){
            System.out.println("Водалей");
        }else if ((d>=19 && m==2) ||(d<=20 && m==3)){
            System.out.println("Рыбы");
        }else if ((d>=21 && m==3) ||(d<=19 && m==4)){
            System.out.println("Овен");
        }else if ((d>=20 && m==4) ||(d<=20 && m==5)) {
            System.out.println("Телец");
        }else if ((d>=21 && m==5) ||(d<=21 && m==6)) {
            System.out.println("Близнецы");
        }else if ((d>=22 && m==6) ||(d<=22 && m==7)) {
            System.out.println("Рак");
        }else if ((d>=23 && m==7) ||(d<=22 && m==8)) {
            System.out.println("Лев");
        }else if ((d>=23 && m==8) ||(d<=22 && m==9)) {
            System.out.println("Дева");
        }else if ((d>=23 && m==9) ||(d<=22 && m==10)) {
            System.out.println("Весы");
        } else if ((d>=23 && m==10) ||(d<=22 && m==11)) {
            System.out.println("Скорпион");
        } else if ((d>=23 && m==11) ||(d<=21 && m==12)) {
            System.out.println("Стрелец");
        }else if ((d>=22 && m==12) ||(d<=19 && m==1)) {
            System.out.println("Козерог");
        }
    }
}
