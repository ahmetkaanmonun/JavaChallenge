package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,42));

    }
    public static boolean hasSharedDigit(int num1,int num2){

        // ? 10<=num1,num2<=99 ==> returned values
        if ((10<=num1 && num1<=99) && (10<=num2 && num2<=99)){

            int num1LastDigit = num1 % 10;
            int num2LastDigit = num2 % 10;
            int num1FirstDigit = num1 / 10;
            int num2FirstDigit = num2 / 10;

            // * Return true if a digit is same

            return (num1FirstDigit == num2FirstDigit) || (num1FirstDigit == num2LastDigit) || (num2FirstDigit == num1LastDigit) || (num1LastDigit == num2LastDigit);



        }


        return false;

    }
}
