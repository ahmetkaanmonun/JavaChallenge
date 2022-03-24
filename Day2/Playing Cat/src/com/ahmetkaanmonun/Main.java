package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        boolean isPlaying = isCatPlaying(false,35);
        System.out.println(isPlaying);

    }

    public static boolean isCatPlaying(boolean summer,int temperature){

        if (summer){

            return 25 <= temperature && temperature <= 45;

        }
        else {

            return 25 <= temperature && temperature <= 35;


        }


    }
}
