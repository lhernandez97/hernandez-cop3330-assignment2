package ex38;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //create arrays for holding the original and the newly formed (only even) numbers
        String[] numbers;
        Integer[] evenOnly;
        //ask the user for numbers
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String num = in.nextLine();
        //make sure that you split the array by spaces
        numbers = num.split(" ");
        //now get the even numbers
        evenOnly = onlyEvenNumbers(numbers);
        //print the even numbers
        System.out.print("The even numbers are ");
        for (int j : evenOnly) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }
    //method to return an integer array with only even numbers
    static Integer[] onlyEvenNumbers(String[] oldArray) {
        //create a new array list
        ArrayList<Integer> onlyEven = new ArrayList<>();
        //now go through each index of the oldArray
        for (String s : oldArray) {
            //turn the numbers into an int variable
            int number = Integer.parseInt(s);
            //now check if the number is divisible by 2, which means that it's an even number
            if (number % 2 == 0) {
                onlyEven.add(number);
            }
        }
        //now convert the new list into an array, and return the array
        Integer[] newArray = new Integer[onlyEven.size()];
        newArray = onlyEven.toArray(newArray);

        return newArray;
    }
}
