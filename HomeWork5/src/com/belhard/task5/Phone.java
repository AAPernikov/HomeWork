package com.belhard.task5;

public class Phone {

    private long number;
    private String model;
    private int weight;

    public Phone (){} // конструктор по умолчанию

    public Phone(long n,String m,int w){
        this(n,m); // вызов другого конструктора в констр.
        weight=w;
    }
    public Phone(long number,String model){
        this.number=number;   // this - указывает на текущий объект, используется если имя поля и имя входного параметра одинаковое
        this.model=model;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void receiveCall (String name){
        System.out.println("Звонит  "+name);

    }
    public void receiveCall (String name,long number){
        System.out.println("Звонит  "+name+" номер телефона "+number);
    }
    public static void sendMessage (long...numbers){
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("номер телефона  " + i + ": " + numbers[i]);
        }
    }
}
