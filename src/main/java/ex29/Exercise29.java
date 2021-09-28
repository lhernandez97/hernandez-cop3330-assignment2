package ex29;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize years to zero
        int years = 0;
        //crate a while loop for repeated input until user inputs a valid input
        while(years == 0) {
            //prompt the user for the rate of return
            System.out.print("What is the rate of return? ");
            String rate = in.nextLine();
            //now check if the input is valid
            try {
                int i = Integer.parseInt(rate);
                years = 72 / i;
                System.out.printf("It will take %d years to double your initial investment.%n", years);
            }
            catch(ArithmeticException e) {
                System.out.println("Sorry. Division by zero is not possible.");
            }
            catch(NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }
}
