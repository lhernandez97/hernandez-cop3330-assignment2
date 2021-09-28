package ex33;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //tell the user to ask a question
        System.out.println("What's your question?");
        System.out.print("> ");
        String q = in.nextLine();
        System.out.println();
        //now get the answer
        String answer = Magic8BallAnswer.randomAnswer();
        //now tell the user their answer
        System.out.printf("%s%n", answer);
    }
}
