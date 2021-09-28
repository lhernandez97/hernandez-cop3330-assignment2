package ex34;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.ArrayList;

public class Print {
    static void printList(ArrayList<String> employeeNames) {
        System.out.printf("There are %d employees:%n", employeeNames.size());
        //make a loop to display the employee names
        for (String employeeName : employeeNames) {
            System.out.printf("%s%n", employeeName);
        }
    }
}
