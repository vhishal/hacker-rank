package com.vhishal.ramsaransing.easy.warmup;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a solution to the problem of calculating the ratios of positive, negative, and zero elements in a list.
 * The problem is described in detail at: https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus {

    /**
     * The main method initializes the input list and calls the method to calculate the ratios.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(input);
    }

    /**
     * This method calculates the ratios of positive, negative, and zero elements in a list.
     * It uses the Java Stream API to filter the elements and count the number of positive, negative, and zero elements.
     * It then calculates the ratios by dividing the counts by the size of the list and prints the results.
     *
     * @param input a list of integers
     */
    static void plusMinus(List<Integer> input) {
        double size = input.size();
        long pos = input.stream().filter(i -> i > 0).count();
        long neg = input.stream().filter(i -> i < 0).count();
        long zero = input.stream().filter(i -> i == 0).count();

        System.out.printf("%.6f%n%.6f%n%.6f%n", pos / size, neg / size, zero / size);
    }
}