package ex31;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask the user for their resting heart rate
        System.out.print("Resting Pulse: ");
        int pulse = in.nextInt();
        System.out.print("Age: ");
        int age = in.nextInt();
        System.out.println();
        //now print the heart rates
        System.out.println("Resting Pulse: " + pulse + "        Age: " + age);
        System.out.println();
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for(double i = 55; i <= 95; i += 5) {
            //turn the intensity into a decimal
            double result = targetHeartRate(pulse, i, age);
            //print the results
            System.out.printf("%.0f%%          | %.0f bpm%n", i, result);
        }
    }
    static double targetHeartRate(int r, double i, int a) {
        //turn the intensity into a decimal
        double intensity = i / 100;
        return (((220 - a) - r) * intensity) + r;
    }
}