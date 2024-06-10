package com.vhishal.ramsaransing.easy.implementation;

/**
 * This class represents a solution to the problem of determining if two kangaroos will meet.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/kangaroo/problem">...</a>
 */
public class Kangaroo {

    /**
     * The main method initializes the parameters for the problem and calls the method to solve it.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        int position = 0;
        int rate = 3;
        int position2 = 4;
        int rate2 = 2;
        System.out.println(kangaroo(position, rate, position2, rate2));
    }

    /**
     * This method determines if two kangaroos, starting at different positions and jumping at different rates, will land at the same position at the same time.
     *
     * @param position  the starting position of the first kangaroo
     * @param rate      the jump rate of the first kangaroo
     * @param position2 the starting position of the second kangaroo
     * @param rate2     the jump rate of the second kangaroo
     * @return "YES" if the kangaroos will meet, "NO" otherwise
     */
    private static String kangaroo(int position, int rate, int position2, int rate2) {
        if (rate <= rate2) {
            return "NO";
        } else {
            return (position2 - position) % (rate - rate2) == 0 ? "YES" : "NO";
        }
    }
}