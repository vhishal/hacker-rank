package com.vhishal.ramsaransing.easy.implementation;

/**
 * This class is used to solve the Beautiful Days at the Movies problem.
 * The problem is to find the number of beautiful days in a range of days.
 * A day is beautiful if the absolute difference between the day and its reverse is evenly divisible by a given number.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem">...</a>
 */
public class BeautifulDaysAtTheMovies {
    /**
     * This is the main method which makes use of beautifulDays method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Print the number of beautiful days in the range from 20 to 23, with 6 as the divisor
        System.out.println(beautifulDays(20, 23, 6));
    }

    /**
     * This method finds the number of beautiful days in a range of days.
     * @param i The start of the range of days.
     * @param j The end of the range of days.
     * @param k The divisor.
     * @return int This returns the number of beautiful days in the range.
     */
    static int beautifulDays(int i, int j, int k) {
        // Initialize the count of beautiful days
        int output = 0;
        // Iterate over the range of days
        for (; i <= j; i++) {
            // Reverse the current day
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            // If the absolute difference between the day and its reverse is evenly divisible by k, increment the count
            if (Math.abs(i - reverse) % k == 0) {
                output++;
            }
        }
        // Return the count of beautiful days
        return output;
    }
}