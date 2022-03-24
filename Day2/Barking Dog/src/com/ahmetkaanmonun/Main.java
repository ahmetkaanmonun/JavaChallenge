package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        boolean wakeUp = shouldWakeUp(true,23);
        System.out.println(wakeUp);
    }
    public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){

         if(hourOfDay<0 || hourOfDay>23) {

             return false;
         }
         else{
             if (hourOfDay<8 || hourOfDay>22){

                 return isBarking;

             }
             return false;


         }


    }
}
