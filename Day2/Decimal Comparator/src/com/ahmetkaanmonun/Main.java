package com.ahmetkaanmonun;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

    boolean isEqual =  areEqualByThreeDecimalPlaces(3.1756,3.175);
        System.out.println(isEqual);

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){



        num1 = (int) (num1*1000);
        num2 = (int) (num2*1000);

        return num1 == num2;


    }
}
