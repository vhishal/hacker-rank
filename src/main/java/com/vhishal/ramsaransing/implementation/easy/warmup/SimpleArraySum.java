package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a solution to the problem of finding the sum of an array of integers.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/simple-array-sum/problem">...</a>
 */
public class SimpleArraySum {

    /**
     * The main method initializes the array of integers and calls the method to calculate the sum.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 10, 11);
        System.out.println(simpleArraySum(input));
    }

    /**
     * This method calculates the sum of a list of integers.
     * It uses the Java Stream API to convert the elements to int values and calculate the sum.
     *
     * @param input a list of integers
     * @return the sum of the integers in the list
     */
    static int simpleArraySum(List<Integer> input) {
        return input.stream().mapToInt(i -> i).sum();
    }
}