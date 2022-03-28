package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(2154)); // * 2 + 4 = 6
        System.out.println(sumFirstAndLastDigit(215)); // * 2 + 5 = 7
        System.out.println(sumFirstAndLastDigit(21)); // * 2 + 1 = 3
        System.out.println(sumFirstAndLastDigit(2)); // * 2 + 2 = 4



    }
    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        int sum = 0;
        if (number<0){

            return -1;

        }

        else if(number >= 10){


            while (number>1){

                number = number/10;
                if (number>0  && number<10){

                    sum = lastDigit + number;


                }

            }

        }
        else{
            sum = number + number;
        }



        return sum;


    }
}
