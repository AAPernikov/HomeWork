package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Task2 {
    public static void main(String[] args){
        Engine e1=new Engine();
        e1.setPower(125);
        e1.setProducer("VW");

        Driver d1=new Driver();
        d1.setName("Gosha");
        d1.setDriveAge(58);

        SportCar s1=new SportCar();
        s1.setBrand("Porshe");
        s1.setClassAuto("C");
        s1.setDriver(d1);
        s1.setEngine(e1);
        s1.setWeightAuto(26);
        s1.setTopSpeed(800);

        Lorry l1=new Lorry();
        l1.setClassAuto("Bisnes");
        l1.setBrand("BMV");
        l1.setDriver(d1);
        l1.setClassAuto("Bed");
        l1.setWeightAuto(1200);
        l1.setBodyLoadCapacity(1258);

        Car c1=new Car();
        c1.setBrand("Ford");
        c1.setDriver(d1);
        c1.setClassAuto("Limusin");
        c1.setEngine(e1);
        c1.setWeightAuto(1980);
        print(c1);
        print(l1);
        print (s1);

    }
    private static void print (Car car) {
        System.out.println(car);
    }
}
