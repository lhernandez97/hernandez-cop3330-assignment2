package ex27;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt the user for their information
        System.out.print("Enter the first name: ");
        String f_name = in.nextLine();
        System.out.print("Enter the last name: ");
        String l_name = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = in.nextLine();
        //now validate the information
        validateInput(f_name, l_name, zip, id);
    }

    static boolean validateFirstName(String f_name) {
        //initialize a variable to be true
        boolean validated = true;
        //check if the first name has less than 2 character, or none, and return false if either
        if (f_name.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            validated = false;
        }
        if (f_name.length() == 0) {
            System.out.println("The first name must be filled in.");
        }
        //if all else, return true
        return validated;
    }

    static boolean validateLastName(String l_name) {
        boolean validated = true;
        if (l_name.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            validated = false;
        }
        if (l_name.length() == 0) {
            System.out.println("The last name must be filled in.");
        }
        //if all else, return true
        return validated;
    }

    static int validateZIPCode(String zipcode) {
        //initialize a variable to check if there are errors
        int errors = 0;
        //check if the length of the zipcode is 5 and if there are any non-numerical values
        try {
            Integer.parseInt(zipcode);
            if(zipcode.length() != 5) {
                errors = 1;
            }
        }
        catch(NumberFormatException e) {
            errors = 1;
        }
        //if there are any errors, print out the error message
        if(errors > 0) {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        //return the number of errors
        return errors;
    }

    static boolean validateEmployeeID(String id) {
        //creating the pattern AA-1234 for the Employee ID to follow
        String format = "[a-zA-Z]{2}[-][0-9]{4}";
        //now check if the Employee ID follows this format
        if(!id.matches(format)) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            //return a false statement
            return false;
        }
        //return true if all else
        return true;
    }

    static void validateInput(String f, String l, String z, String i) {
        //validate the first name
        boolean fname_good = validateFirstName(f);
        //validate the last name
        boolean lname_good = validateLastName(l);
        //validate the ZIP code
        int num_of_errors = validateZIPCode(z);
        //validate the Employee ID
        boolean id_good = validateEmployeeID(i);
        //if all else, there are no errors
        if(fname_good && lname_good && num_of_errors == 0 && id_good) {
            System.out.println("There are no errors.");
        }
    }
}