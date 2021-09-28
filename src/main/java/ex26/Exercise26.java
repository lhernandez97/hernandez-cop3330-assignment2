package ex26;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //create a PaymentCalculator object
        PaymentCalculator calc = new PaymentCalculator();
        //prompt the user for the balance
        System.out.print("What is the balance? ");
        double balance = in.nextDouble();
        //prompt the user for the APR on the card
        System.out.print("What is the APR on the card (as a percentage)? ");
        double apr = in.nextDouble();
        //prompt the user for the monthly payment
        System.out.print("What is the monthly payment you can make? ");
        double monthly_pay = in.nextDouble();
        //do calculations
        double apr_per = apr / 100;
        double daily_rate = apr_per / 365;
        //get the number of months
        int num_of_months = calc.calculateMonthsUntilPaidOff(balance, daily_rate, monthly_pay);
        //tell the user the months they need to pay off their card
        System.out.printf("It will take you %d months to pay off this card.%n", num_of_months);
    }
}
