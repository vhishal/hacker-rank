package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a solution to the problem of finding the minimum and maximum possible sums of a list of integers.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/mini-max-sum/problem">...</a>
 */
public class MiniMaxSum {

    /**
     * The main method initializes the input lists and calls the method to calculate the minimum and maximum sums.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(input);
        List<Integer> input2 = Arrays.asList(793810624, 895642170, 685903712, 623789054, 468592370);
        miniMaxSum(input2);
    }

    /**
     * This method calculates the minimum and maximum possible sums of a list of integers.
     * It uses the Java Stream API to sort the list, convert the elements to long values, and calculate the sums.
     *
     * @param input a list of integers
     */
    static void miniMaxSum(List<Integer> input) {
        List<Long> sortedInput = input.stream().sorted().mapToLong(Integer::longValue).boxed().toList();
        long min = sortedInput.stream().limit(4).mapToLong(Long::longValue).sum();
        long max = sortedInput.stream().skip(1).mapToLong(Long::longValue).sum();
        System.out.println(min + " " + max);
    }
}