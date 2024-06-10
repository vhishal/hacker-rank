package com.vhishal.ramsaransing.easy.warmup;

/**
 * This class provides a solution to the problem of adding two integers.
 * The main method calls the solveMeFirst method with two integers as arguments.
 * The solveMeFirst method returns the sum of the two integers.
 */
public class SolveMeFirst {

    /**
     * The main method is the entry point of the program.
     * It calls the solveMeFirst method with two integers and prints the result.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        System.out.println(solveMeFirst(1, 2));
    }

    /**
     * This method adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    static int solveMeFirst(int a, int b) {
        return a + b;
    }
}