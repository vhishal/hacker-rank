package com.vhishal.ramsaransing.easy.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * This class represents a solution to the problem of comparing the scores of two triplets.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem">...</a>
 */
public class CompareTheTriplets {

    /**
     * The main method initializes the triplets and calls the method to compare them.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);
        System.out.println(compareTriplets(a, b));
    }

    /**
     * This method compares two triplets and returns a list of two integers representing the scores.
     * The first integer is the score of the first triplet and the second integer is the score of the second triplet.
     * A triplet's score is incremented by 1 for each element that is greater than the corresponding element of the other triplet.
     *
     * @param a the first triplet
     * @param b the second triplet
     * @return a list of two integers representing the scores of the triplets
     */
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int scoreA = (int) IntStream.range(0, a.size()).filter(i -> a.get(i) > b.get(i)).count();
        int scoreB = (int) IntStream.range(0, a.size()).filter(i -> a.get(i) < b.get(i)).count();
        return Arrays.asList(scoreA, scoreB);
    }
}