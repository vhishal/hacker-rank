package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a solution to the problem of finding the absolute difference between the sums of two diagonals in a square matrix.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/diagonal-difference/problem">...</a>
 */
public class DiagonalDifference {

    /**
     * The main method initializes the square matrix and calls the method to calculate the diagonal difference.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12));
        System.out.println(diagonalDifference(input));
    }

    /**
     * This method calculates the absolute difference between the sums of the diagonals in a square matrix.
     * It uses a for loop to iterate over the elements of the diagonals and calculate their sums.
     *
     * @param squareMatrix a square matrix of integers
     * @return the absolute difference between the sums of the diagonals
     */
    private static int diagonalDifference(List<List<Integer>> squareMatrix) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int size = squareMatrix.size();

        for (int i = 0; i < size; i++) {
            leftDiagonal += squareMatrix.get(i).get(i);
            rightDiagonal += squareMatrix.get(i).get(size - i - 1);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }
}