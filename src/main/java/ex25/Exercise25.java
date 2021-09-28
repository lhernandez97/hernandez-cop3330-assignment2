package ex25;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //create a variable to determine password strength
        String validate = "";
        int pass_strength;
        //prompt the user for a password
        System.out.print("Enter a password: ");
        String password = in.nextLine();
        //get the strength of the password
        pass_strength = passwordValidator(password);
        //now determine the strength
        if(pass_strength == 0) {
            validate = "very weak";
        }
        if(pass_strength == 1) {
            validate = "weak";
        }
        if(pass_strength == 2) {
            validate = "strong";
        }
        if(pass_strength == 3) {
            validate = "very strong";
        }
        //print the results
        System.out.printf("The password '%s' is a %s password.%n", password, validate);
    }
    public static int passwordValidator(String pass) {
        //initiate a variable to return strength, and count the number of letters/special symbols
        int letters = 0;
        int special = 0;
        int strength = 0;
        //create a char[] arr for pass
        char[] arr = pass.toCharArray();
        //count the number of special characters it might have
        for(int i = 0; i < pass.length(); i++) {
            if(!Character.isDigit(arr[i]) && !Character.isLetter(arr[i])) {
                special++;
            }
            else if(Character.isLetter(arr[i])) {
                letters++;
            }
        }
        //check if the password is less than 8 characters
        if(pass.length() < 8) {
            //check if the entire array has letters
            if(pass.length() == letters) {
                strength = 1;
            }
        }
        if(pass.length() >= 8) {
            //check if the array has a digit and no special characters, it is a strong password
            for(int i = 0; i < pass.length(); i++) {
                if(Character.isDigit(arr[i]) && special == 0) {
                    strength = 2;
                }
                else if(Character.isDigit(arr[i]) && special > 0) {
                    strength = 3;
                }
            }
        }
        //return the strength
        return strength;
    }
}
