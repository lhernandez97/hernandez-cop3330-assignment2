package ex28;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class TotalFinder {
    public void findTheTotal() {
        Scanner in = new Scanner(System.in);
        //initialize the total
        int [] num = new int[5];
        int total = 0;
        //make a loop that will ask the user for five numbers
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            num[i] = in.nextInt();
            total += num[i];
        }
        System.out.printf("The total is %d.", total);
    }
}
