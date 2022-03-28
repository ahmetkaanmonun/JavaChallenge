package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(30));
        System.out.println(getLargestPrime(63));
    }
    public static int getLargestPrime(int num){

        if (num <= 0 || isPrimeNumber(num)){

            return -1;

        }


        for (int i = 2;i<num;i++){

            if (num % i == 0){

                while (num>10 && !isPrimeNumber(num)){



                        num /= i;




                }
            }



        }
        return num;
    }
    public static boolean isPrimeNumber(int num){

        if (num >= 2 ){

            if (num == 2){

                return true;
            }

            for (int i = 2;i<num;i++){

                if (num % i == 0){

                    return false;


                }



            }




        }
        else return num != 0 && num != 1;

        return true;


    }
}
