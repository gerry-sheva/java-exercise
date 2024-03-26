package com.adepuu.exercises.session6;

import java.util.Objects;
import java.util.Scanner;

public class Exercise1 {
    /**
     * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
     *
     * Input: 1, 2, 3, 4, 5, q
     * Output: 3
     *
     * Input: 1, 2, 3, a, b, 4, 5, q
     * Output: 3
     *
     * Explanation: print “Invalid input. Please enter a valid number or 'q' to finish.” if user not inserting the expected number or character.
     */
    public static void main(String[] args) {
//        System.out.println("wha");
        Solution solution = new Solution();
        solution.calculateAvg();
    }
}

class Solution {

    public void calculateAvg() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double i = 0;
        boolean isDone = false;
        while (!isDone) {
            String input = scanner.next();
            if (input.equals("q") || input.equals("Q")) {
                isDone = true;
            } else {
                try {
                    sum += Double.parseDouble(input);
                    ++i;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
                    System.out.printf("The last average of your inputs is: %f", sum/i);
                    isDone = true;
                }
            }
        }
        System.out.println(sum/i);
    }
}
