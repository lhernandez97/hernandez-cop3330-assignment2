package ex36;

/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.ArrayList;

public class MathematicalSolutions {
    public double average(ArrayList<Integer> a) {
        //initialize the total
        int total = 0;
        //make a for loop to add the numbers in the list
        for(int i : a) {
            total += i;
        }
        //calculate and return the average
        return (double) total/a.size();
    }
    public int max(ArrayList<Integer> b) {
        //make the max the first number to begin with
        int max_num = b.get(0);
        //make a for loop, and update the max if the number is greater than the current max number
        for(int i : b) {
            if(i > max_num) {
                max_num = i;
            }
        }
        //return the max number
        return max_num;
    }
    public int min(ArrayList<Integer> c) {
        //max the min the first number to begin with
        int min_num = c.get(0);
        //make a for loop, and update the min if the number is less than the current min number
        for(int i : c) {
            if(i < min_num) {
                min_num = i;
            }
        }
        //return the min number
        return min_num;
    }
    public double std(ArrayList<Integer> d) {
        //get the mean of the numbers
        double mean = average(d);
        //get the sum of the numbers
        double sum = 0;
        for(int i : d) {
            sum += Math.pow(i - mean, 2);
        }
        //now return the standard deviation
        return Math.sqrt(sum / d.size());
    }
}
