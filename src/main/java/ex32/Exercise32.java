package ex32;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;
import java.util.Random;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize needed variables
        String cont = "";
        int answer = 0;
        int guess;
        //greet the user tp the game
        System.out.println("Let's play Guess the Number!");
        System.out.println();
        //make a while loop for the user to keep playing until they type "n"
        while(!cont.equals("n")) {
            int num_of_guesses = 1;
            //ask the user for the difficulty level
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int diff = in.nextInt();
            //now get the number that the user should try to guess, based on the difficulty level
            if(diff == 1) {
                answer = level1();
            }
            if(diff == 2) {
                answer = level2();
            }
            if(diff == 3) {
                answer = level3();
            }
            System.out.print("I have my number. What's your guess? ");
            guess = in.nextInt();
            //if they got it wrong, tell the user if they were too high or too low, and make them guess again
            do {
                if(guess < answer) {
                    System.out.print("Too low. Guess again: ");
                    num_of_guesses++;
                    guess = in.nextInt();
                }
                else if(guess > answer){
                    System.out.print("Too high. Guess again: ");
                    num_of_guesses++;
                    guess = in.nextInt();
                }
            } while(guess != answer);
            //when the user guesses the number, tell them how many guesses it took
            System.out.printf("You got it in %d guesses!%n", num_of_guesses);
            //ask the user if they wish to play again
            in.nextLine();
            System.out.println();
            System.out.print("Do you wish to play again (Y/N)? ");
            cont = in.nextLine();
            System.out.println();
        }
    }
    //methods for choosing a random number, based on the difficulty level chosen by the user
    public static int level1() {
        Random rnd = new Random();
        return rnd.nextInt(10) + 1;
    }
    public static int level2() {
        Random rnd = new Random();
        return rnd.nextInt(100) + 1;
    }
    public static int level3() {
        Random rnd = new Random();
        return rnd.nextInt(1000) + 1;
    }
}
