package com.belhard.task5;

public class Task1 {
    public static void main (String[] args){
        Phone p1=new Phone();
        p1.setNumber(986578);
        p1.setModel("Samsung");
        p1.setWeight(560);

        Phone p2=new Phone(236679, "Iphone");
        p2.setWeight(698);

        Phone p3=new Phone(56987, "Xiaomi",210);

        printPhone(p1);
        printPhone(p2);
        printPhone(p3);

        p1.receiveCall("Alexandr");
        p2.receiveCall("Kate");
        p3.receiveCall("Kirill");

        p1.receiveCall("Alexandr",36588888);
        p2.receiveCall("Kate", 36666666);
        p3.receiveCall("Kirill",55588777);


        System.out.println("Номер телефона  "+p1.getNumber());
        System.out.println("Номер телефона  "+p2.getNumber());
        System.out.println("Номер телефона  "+p3.getNumber());

        Phone.sendMessage(3666666,5899999,111111,5555,5566); //sendMessage - static поэтому вызываем через класс, а не через объект
    }
    private static void printPhone (Phone phone){ // метод вывода переменных на консоль
        System.out.println("Номер телефона  "+phone.getNumber());
        System.out.println("Модель телефона  "+phone.getModel());
        System.out.println("Вес телефона   "+phone.getWeight());
    }


}
