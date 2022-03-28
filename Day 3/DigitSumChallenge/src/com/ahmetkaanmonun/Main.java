package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(163455));    }
    public static int sumDigits(int number){

        if(number<10){

            return -1;

        }
        int sum = 0;
        int lastDigit;

        while (number>0){

            lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;



        }
      return sum;

    }
}
