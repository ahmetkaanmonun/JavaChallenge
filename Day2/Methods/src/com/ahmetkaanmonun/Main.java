package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int score1 = calculateScore(isGameOver,score,levelCompleted,bonus);
        int score2 = calculateScore(true,100,5,200);
        int age = calculateAge(2022,1998);

        System.out.println(score1);
        System.out.println(score2);
        System.out.println(age);

        int scoreKaan =calculateHighScorePosition(1500);
         displayHighScorePosition("Kaan",scoreKaan);


        int scoreOguz =calculateHighScorePosition(900);
        displayHighScorePosition("Oguz",scoreOguz);


        int scoreIsa =calculateHighScorePosition(400);
         displayHighScorePosition("İsa",scoreIsa);


        int scoreAhmet =calculateHighScorePosition(50);
        displayHighScorePosition("Ahmet",scoreAhmet);


    }

    // * Method
    public static int calculateScore(boolean isGameOver,int score,int levelCompleted,int bonus){

        if (isGameOver){

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        else{

            return -1;

        }


    }
    public static int calculateAge(int currentYear,int birthYear){

        return currentYear-birthYear;


    }
    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){

        if(playerScore>=1000){

           return 1;

        }
        else if(playerScore>=500){


            return 2;

        }
        else if(playerScore>=100){

            return 3;

        }


            return 4;


    }
}
