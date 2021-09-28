package ex35;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //create an ArrayList
        ArrayList<String> name = new ArrayList<>();
        //make a while loop that will ask the user for a name until they enter a blank string
        while(!name.contains("")) {
            //tell the user to enter a name
            System.out.print("Enter a name: ");
            String nm = in.nextLine();
            //add the name to the list
            name.add(nm);
        }
        //remove the blank from the list
        name.remove("");
        //now to display the results
        displayResult(name, name.size());
    }
    public static void displayResult(ArrayList<String> name, int size) {
        Random rnd = new Random();
        //pick a random index from the list
        int i = rnd.nextInt(size);
        //now display the result
        System.out.printf("The winner is... %s.%n", name.get(i));
    }
}
