package ex37;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.*;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt the user for the requirements for the generated password
        System.out.print("What's the minimum length? ");
        int length = in.nextInt();
        System.out.print("How many special characters? ");
        int sc = in.nextInt();
        System.out.print("How many numbers? ");
        int num = in.nextInt();
        //now generate the password
        String password = generatePassword(length, sc, num);
        //tell the user the new generated password
        System.out.println("Your password is " + password);
    }
    //method to generate the password
    public static String generatePassword(int l, int s, int n) {
        //create a Random object
        Random rnd = new Random();
        //create arrays for the characters, numbers and special characters and for the final password
        String pass = "";
        String special = "*%&$@#!*^";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        //get the lengths of the arrays
        int s_length = special.length();
        int l_length = letters.length();
        int n_length = numbers.length();
        //now create a list for the password
        ArrayList<Character> password = new ArrayList<>();
        //first, generate random special characters and put them in the array list
        for(int i = 0; i < s; i++) {
            password.add(special.charAt(rnd.nextInt(s_length)));
        }
        //second, generate random numbers and put them in the array list
        for(int i = 0; i < n; i++) {
            password.add(numbers.charAt(rnd.nextInt(n_length)));
        }
        //third, generate the letters for the remaining part of the password
        for(int i = password.size(); i < l; i++) {
            password.add(letters.charAt(rnd.nextInt(l_length)));
        }
        //shuffle the password
        Collections.shuffle(password);
        //give the password to the pass array
        for(Character i : password) {
            pass += Character.toString(i);
        }
        //return the password
        return pass;
    }
}
