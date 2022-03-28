package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        int value = getDaysInMonth(4,2020);
        System.out.println(value);
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
    public static int getDaysInMonth(int month,int year){

        if(month <1 ||month>12||year <1 ||year>9999)

            return -1;

        switch (month){

            case 4:

            case 6:

            case 9:

            case 11:

                return 30;

            case 2:

                if(isLeapYear(year))

                    return 29;

                return 28;

            default: return 31;
    }


}}
