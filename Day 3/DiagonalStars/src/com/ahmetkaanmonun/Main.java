package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        printSquareStar(5);
    }
    public static void printSquareStar(int num){


            if(num < 5) System.out.println("Invalid Value");
            else{
                for (int i = 0; i <num; i++){
                    for (int j=0; j<num; j++){
                        if(i==0 || i==num-1 || j==0 || j==num-1 || j==i || j==num-1-i) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.println("");
                }
            }


    }
}
