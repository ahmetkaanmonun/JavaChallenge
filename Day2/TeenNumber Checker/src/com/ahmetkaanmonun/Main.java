package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

	 boolean hasTeen = hasTeen(12,13,23);
        System.out.println(hasTeen);
    }
    public static boolean hasTeen(int num1,int num2,int num3){

        return isTeen(num1) || isTeen(num2) || isTeen(num3);

    }
    public static boolean isTeen(int num){

        return 13 <= num && num <= 19;

    }
}
