package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        // * Floating Point Numbers (32 bits)

        float minFloatNumber = Float.MIN_VALUE;
        float maxFloatNumber = Float.MAX_VALUE;
        System.out.println("Float min value = " + minFloatNumber );
        System.out.println("Float max value = " + maxFloatNumber );

        // * Double Point Numbers (32 bits)

        double minDoubleNumber = Double.MIN_VALUE;
        double maxDoubleNumber = Double.MAX_VALUE;
        System.out.println("Double min value = " + minDoubleNumber );
        System.out.println("Double max value = " + maxDoubleNumber);

        int myIntValue = 5/2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        // ? Challenge - Convert a given number of pounds to kilograms

        double pounds = 200d;
        double convertedKilograms = pounds * 0.45359237d;
        System.out.println(convertedKilograms + " kg ");

    }
}
