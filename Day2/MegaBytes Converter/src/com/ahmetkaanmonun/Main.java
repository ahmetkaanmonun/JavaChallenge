package com.ahmetkaanmonun;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes<0){

            System.out.println("Invalid Value");

        }
        else {
            int megabyte = kiloBytes / 1024;
            int lastkiloBytes = kiloBytes - megabyte*1024;
            System.out.println(kiloBytes + " KB = " + megabyte + " MB and " + lastkiloBytes + " KB " );

        }

    }

}
