package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        // * Info
        // ? Note
        // ! Warning

        // * Integer (-2147483648,2147483647) (32 bits)

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; // ? Integer ==> Wrapper Class that it gives us ways to perform operations on an int.
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);

        // * Overflow and Underflow

        // ? Overflow ==> If you try put a value larger than the max value then you will get overflow in the case of the max value.
        // ? Underflow ==> If you try put a value smaller than the min value then you will get underflow in the case of the min value.

        System.out.println("Busted Min Value =" + (myMinIntValue - 1));
        System.out.println("Busted Max Value =" + (myMinIntValue + 1));

        // * Byte (-127,128) (8 bits)

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        // * Short (-32768,32767) (16 bits)

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        // * Long (-9223372036854775808,9223372036854775807 ) (64 bits)

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);

        // * Long > Integer > Short > Byte


        short bigShortLiteralValue = 32767;
        int myTotal = (myMinIntValue/2);

        // ? Casting ==> It means to treat or convert a number from one type to another.
        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

    }
}
