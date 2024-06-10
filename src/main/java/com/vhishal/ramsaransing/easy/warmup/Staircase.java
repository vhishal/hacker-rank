package com.vhishal.ramsaransing.easy.warmup;

import java.util.stream.IntStream;

/**
 * This class represents a solution to the problem of drawing a staircase.
 * The staircase is right-aligned, composed of '#' symbols and spaces, and has a height and width equal to the input integer.
 * The problem is described in detail at: https://www.hackerrank.com/challenges/staircase/problem
 */
public class Staircase {

    /**
     * The main method initializes the height of the staircase and calls the method to draw it.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        staircase(10);
    }

    /**
     * This method draws a staircase of a given height.
     * It uses the Java Stream API to generate the strings for each step of the staircase and print them.
     *
     * @param input the height of the staircase
     */
    static void staircase(int input) {
        IntStream.range(0, input).mapToObj(i -> " ".repeat(input - i - 1) + "#".repeat(i + 1)).forEach(System.out::println);
    }
}