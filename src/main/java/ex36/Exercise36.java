package ex36;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize variables
        String num;
        //create a MathematicalSolutions object
        MathematicalSolutions math = new MathematicalSolutions();
        //crate an integer ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        //now make a loop for the user to enter numbers until they type "done"
        do {
            System.out.print("Enter a number: ");
            num = in.nextLine();
            //now make an if statement to remove non-numerical values
            if(!num.equals("done")) {
                try {
                    int number = Integer.parseInt(num);
                    //add the number into the list
                    list.add(number);
                }
                catch(NumberFormatException e) {
                    //we are not going to add exceptions to the list
                }
            }
        } while(!num.equals("done"));
        //now do the calculations
        double avg = math.average(list);
        int max = math.max(list);
        int min = math.min(list);
        double std = math.std(list);
        //now print out the results
        System.out.print("Numbers: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%d, ", list.get(i));
        }
        System.out.println();
        System.out.printf("The average is %.1f%n", avg);
        System.out.printf("The minimum is %d%n", min);
        System.out.printf("The maximum is %d%n", max);
        System.out.printf("The standard deviation is %.2f%n", std);
    }
}
