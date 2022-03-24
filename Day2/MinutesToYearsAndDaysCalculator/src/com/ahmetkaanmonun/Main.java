package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {


    printYearsAndDays(1051200);

    }
    public static void printYearsAndDays(long minutes){

        long day = (minutes/60)/24;
        long year = day/365;
        long lastDay = minutes % day;

        if(minutes<0){

            System.out.println("Invalid Value");;

        }
        else {



            System.out.println(minutes + " min = " + year + " y and " + lastDay + " d" );

        }


    }
}
