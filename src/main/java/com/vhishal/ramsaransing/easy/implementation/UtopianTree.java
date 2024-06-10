package com.vhishal.ramsaransing.easy.implementation;

/**
 * This class represents a Utopian Tree which grows in a specific pattern.
 * The tree doubles its height every spring and increases by 1 every summer.
 * * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/utopian-tree/problem">...</a>
 */
public class UtopianTree {
    /**
     * This is the main method which makes use of utopianTree method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Print the height of the tree after 4 cycles
        System.out.println(utopianTree(4));
    }

    /**
     * This method calculates the height of the tree after n cycles.
     * @param cycles The number of cycles.
     * @return int This returns the height of the tree after n cycles.
     */
    static int utopianTree(int cycles) {
        // Initialize the height of the tree
        int height = 1;
        // Iterate over the cycles
        for (int i = 0; i < cycles; i++) {
            // Calculate the height of the tree after the current cycle
            height = (i % 2 == 0) ? height * 2 : height + 1;
        }
        // Return the height of the tree after n cycles
        return height;
    }
}