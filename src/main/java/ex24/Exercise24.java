package ex24;

/*
* UCF COP3330 Fall 2021 Assignment 2 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;
import java.util.Arrays;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //tell the user to enter two strings to check if they are anagrams
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        //prompt the user for the two strings
        System.out.print("Enter the first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = in.nextLine();
        //make a boolean variable to check if the strings are anagrams
        boolean result = isAnagram(s1, s2);
        //now tell the user if the words are anagrams or not
        if(result) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.%n", s1, s2);
        }
        else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.%n", s1, s2);
        }
    }
    //create a method to find out whether the two strings are anagrams
    public static boolean isAnagram(String a, String b) {
        //if the lengths are different, then they are not anagrams
        if(a.length() != b.length()) {
            return false;
        }
        //now turn the Strings into a char array
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        //now sort the two char arrays
        Arrays.sort(a1);
        Arrays.sort(b1);
        //now check if the two strings are equal
        for(int i = 0; i < a.length(); i++) {
            //check to see if even one of the characters don't equal
            if(a1[i] != b1[i]) {
                return false;
            }
        }
        //if all else, the words are anagrams
        return true;
    }
}
