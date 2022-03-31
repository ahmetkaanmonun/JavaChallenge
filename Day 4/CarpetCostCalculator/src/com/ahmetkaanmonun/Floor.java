package com.ahmetkaanmonun;

public class Floor {

    private double width;
    private double length;

    public Floor(){

        this(1.0,2.0);

    }

    public Floor(double width, double length) {

        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;

    }

    public double getArea(){

        return this.width * this.length;

    }

}
