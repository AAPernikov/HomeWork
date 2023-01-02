package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String classAuto;
    private int weightAuto;
    private Driver driver;
    private Engine engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public void setClassAuto(String classAuto) {
        this.classAuto = classAuto;
    }

    public int getWeightAuto() {
        return weightAuto;
    }

    public void setWeightAuto(int weightAuto) {
        this.weightAuto = weightAuto;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weightAuto=" + weightAuto +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
    public void start (){
        System.out.println("Поехали");
    }
    public void stop (){
        System.out.println("Останавливаемя");
    }
    public void turnRight (){
        System.out.println("Поворот направо ");
    }
    public void turnLeft (){
        System.out.println("Поворот налево ");
    }

}
