package com.ahmetkaanmonun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(467891));

    }
    public static int getEvenDigitSum(int number){

        if (number<0){

            return -1;

        }

        int sum = 0;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        for (int j : numbers) {

            if (j % 2 == 0) {

                sum += j;

            }

        }
        return sum;

    }
}
