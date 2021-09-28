package ex26;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(double b, double i, double p) {
        //return the number of months
        return (int) Math.ceil((-1/30.0) * Math.log(1 + b/p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i));
    }
}
