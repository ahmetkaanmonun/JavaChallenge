package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        // * String (It is actually a Class)

        // ? Strings are immutable. That means you can't change a String after it's created. 05379552060

        String myString = "This is a string";

        System.out.println("My string : " + myString);

        myString = myString + " and more";

        System.out.println(myString);

        myString = myString + '\u00A9';

        String numberString = "250.00";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50 ;

        lastString += myInt;
        
        System.out.println(lastString);


    }
}
