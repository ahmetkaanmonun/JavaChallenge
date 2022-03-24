package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {


        // * Challenge


        byte myByteNumber = 10;
        short myShortNumber = 20000;
        int myIntNumber = 300000;
        int totalValue = myByteNumber + myIntNumber + myShortNumber;
        long myLongNumber = 50000L + 10L * totalValue;

        System.out.println(myLongNumber);

    }
}
