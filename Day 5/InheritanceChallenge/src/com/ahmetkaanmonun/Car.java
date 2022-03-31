package com.ahmetkaanmonun;

public class Car extends Vehicle{

    private int wheels;

    private int gearType;
    private int engine;
    private int speed;


    public Car(String model, int price, int modelYear, String color, int wheels, int gearType, int engine, int speed) {
        super(model, price, modelYear, color);
        this.wheels = wheels;
        this.gearType = gearType;
        this.engine = engine;
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getGearType() {
        return gearType;
    }

    public void setGearType(int gearType) {
        this.gearType = gearType;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



}
