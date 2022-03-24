package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

    String x = getDurationString(20,32);
        System.out.println(x);
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes,int seconds){

        int hour = minutes/60;
        int remainingMinutes = minutes % 60;

        if (minutes>=0 && (seconds >=0 && seconds <=59)){

            return hour + "h " + remainingMinutes +"m " + seconds +"s";

        }
        else{

            return "Invalid value";

        }

    }
    public static String getDurationString(int seconds){

        if (seconds<0){

            return "Invalid value";

        }
        int minutes = seconds/60;
        int remainingSeconds = seconds % 60 ;

        return  getDurationString(minutes,remainingSeconds);
    }
}
