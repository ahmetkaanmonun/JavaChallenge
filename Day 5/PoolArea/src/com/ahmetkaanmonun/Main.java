package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(1.21,3.3);
        System.out.println("Rectangle area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(rectangle.getWidth(),rectangle.getLength(),1.21);
        System.out.println("Cuboid volume = " + cuboid.getVolume());
    }
}
