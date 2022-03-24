package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {


        boolean isLeapYear = isLeapYear(1924);
        System.out.println(isLeapYear);
    }

    public static boolean isLeapYear(int year){

        if(year>=1 && year<=9999){

            if(year % 4 == 0){

                if(year % 100 == 0){

                    return year % 400 == 0;

                }
                else {

                    return true;

                }


            }
            else {

                return false;

            }

        }
        else {

            return false;

        }


    }
}
