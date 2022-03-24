package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim",50);
        System.out.println("New score is " + newScore);
        int score = calculateScore(10);
        System.out.println(score);
    }

    // * Method Overloading

    public static int calculateScore(String playerName,int score){

        System.out.println("Player " + playerName +  " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore(int score ){

        System.out.println(score);
        return score*1000;
    }
}
