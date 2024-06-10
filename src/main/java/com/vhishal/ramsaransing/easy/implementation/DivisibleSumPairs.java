package com.vhishal.ramsaransing.easy.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to count the number of pairs in an array that are divisible by a given number.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs/problem">...</a>
 */
public class DivisibleSumPairs {
    /**
     * This is the main method which makes use of divisibleSumPairs method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // List of integers
        List<Integer> pais = Arrays.asList(1, 3, 2, 6, 1, 2);
        // Print the number of pairs that are divisible by 3
        System.out.println(divisibleSumPairs(6, 3, pais));
    }

    /**
     * This method counts the number of pairs in an array that are divisible by a given number.
     * @param n The number of elements in the array.
     * @param k The number by which the sum of the pairs should be divisible.
     * @param ar The list of integers.
     * @return int This returns the number of pairs that are divisible by k.
     */
    static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Initialize the count of pairs
        int count = 0;
        // Iterate over the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the pair is divisible by k
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    // Increment the count of pairs
                    count++;
                }
            }
        }
        // Return the count of pairs
        return count;
    }
}