package com.ahmetkaanmonun;

public class Rectangle {

    private double width;

    public Rectangle(double width, double length) {
        if (width<0){

            this.width = 0;
        }
        else if (length<0){

            this.length = 0;
        }
        else {
            this.width = width;
            this.length = length;
        }
        }

    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){

        return width*length;

    }


}
