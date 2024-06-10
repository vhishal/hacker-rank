package com.vhishal.ramsaransing.easy.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to solve the birthday chocolate bar problem.
 * The problem is to find how many ways a chocolate bar can be divided into contiguous pieces such that the sum of the pieces equals the birthday and the number of pieces equals the birth month.
 * * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/the-birthday-bar/problem">...</a>
 */
public class TheBirthdayBar {
    /**
     * This is the main method which makes use of birthday method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // List of integers representing the chocolate bar
        List<Integer> chocolate = Arrays.asList(1, 2, 1, 3, 2);
        // Print the number of ways the chocolate bar can be divided
        System.out.println(birthday(chocolate, 3, 2));
    }

    /**
     * This method finds the number of ways a chocolate bar can be divided into contiguous pieces such that the sum of the pieces equals the birthday and the number of pieces equals the birth month.
     * @param chocolate This is the list of integers representing the chocolate bar. Each integer represents a piece of the chocolate bar.
     * @param d This is the birthday. The sum of the pieces should equal this number.
     * @param m This is the birth month. The number of pieces should equal this number.
     * @return int This returns the number of ways the chocolate bar can be divided.
     */
    static int birthday(List<Integer> chocolate, int d, int m) {
        // Initialize the count of ways
        int output = 0;
        // Iterate over the chocolate bar
        for (int i = 0; i <= chocolate.size() - m; i++) {
            // Initialize the sum of the pieces
            int sum = 0;
            // Iterate over m pieces
            for (int j = 0; j < m; j++) {
                // Add the current piece to the sum
                sum += chocolate.get(i + j);
            }
            // If the sum of the pieces equals the birthday, increment the count
            if (sum == d) {
                output++;
            }
        }
        // Return the count of ways
        return output;
    }
}