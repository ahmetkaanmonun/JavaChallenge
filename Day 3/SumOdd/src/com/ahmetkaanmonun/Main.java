package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        // * Test inputs
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));


    }
    public static boolean isOdd (int number){

        if (number<0){

            return false;

        }
        else{

            return number % 2 == 1;

        }


    }
    public static int sumOdd(int start,int end){

        int sum = 0;

        if((end>=start) && (start>0)){



            for (int i=start;i<=end;i++){

                if (isOdd(i)){

                    sum+=i;


                }



            }
            return sum;

        }
        else {

            return -1;

        }


    }
}
