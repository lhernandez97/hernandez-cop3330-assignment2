package ex34;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> employeeNames = new ArrayList<>();
        //add employee names to the list
        employeeNames.add("John Smith");
        employeeNames.add("Jackie Jackson");
        employeeNames.add("Chris Jones");
        employeeNames.add("Amanda Cullen");
        employeeNames.add("Jeremy Goodwin");
        //now display the employee names
        Print.printList(employeeNames);
        //ask the user which employee they want to remove
        System.out.printf("%nEnter an employee name to remove: ");
        String name = in.nextLine();
        System.out.println();
        //remove the employee
        employeeNames.remove(name);
        //now give the user the updated list
        Print.printList(employeeNames);
    }
}
