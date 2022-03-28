package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(99,99,999));
    }
    public static boolean isValid(int num){

        return 10 <= num && num <= 1000;
    }
    public static boolean hasSameLastDigit(int num1,int num2,int num3){

        if (isValid(num1) && isValid(num2) && isValid(num3)){

            int num1lastDigit = num1 % 10;
            int num2lastDigit = num2 % 10;
            int num3lastDigit = num3 % 10;

            return (num1lastDigit == num2lastDigit) || (num1lastDigit == num3lastDigit) || (num2lastDigit == num3lastDigit);



        }

        return false;

    }

}
