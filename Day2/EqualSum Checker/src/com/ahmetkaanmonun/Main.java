package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        boolean hasEqualSum = hasEqualSum(1,1,2);
        System.out.println(hasEqualSum);
    }

    public static boolean hasEqualSum(int num1,int num2,int num3){

        return num1 + num2 == num3;

    }
}
