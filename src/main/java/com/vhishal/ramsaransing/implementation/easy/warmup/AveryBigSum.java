package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a solution to the problem of calculating a very big sum.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem">...</a>
 */
public class AveryBigSum {

    /**
     * The main method initializes the array of long integers and calls the method to solve it.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        long[] inputArr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        List<Long> input = Arrays.stream(inputArr).boxed().toList();
        System.out.println(aVeryBigSum(input));
    }

    /**
     * This method calculates the sum of a list of long integers.
     * It uses the Java Stream API to perform the calculation in a functional style.
     *
     * @param input a list of long integers
     * @return the sum of the list
     */
    static long aVeryBigSum(List<Long> input) {
        return input.stream().mapToLong(i -> i).sum();
    }
}