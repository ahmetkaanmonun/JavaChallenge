package com.ahmetkaanmonun;

public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(0.0);
    }

    public static long toMilesPerHour(double kilometersPerHour){ // ? 1 mile per hour 1.609 kilometers

        if(kilometersPerHour >= 0){

            return Math.round(kilometersPerHour/1.609d);


        }

        return -1;

    }
    public static void printConversion(double kilometersPerHour){

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour<0){
            System.out.println("Invalid value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " +  milesPerHour + " mi/h " );
        }




    }
}
