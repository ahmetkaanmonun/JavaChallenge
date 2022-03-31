package com.ahmetkaanmonun;

public class Vehicle {

    private String model;
    private int price;
    private int modelYear;
    private String color;

    public Vehicle(String model, int price, int modelYear, String color) {
        this.model = model;
        this.price = price;
        this.modelYear = modelYear;
        this.color = color;
    }


    public void move(){


    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
