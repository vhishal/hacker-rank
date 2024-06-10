package com.vhishal.ramsaransing.easy.implementation;

/**
 * This class is used to count the number of valleys a hiker has walked through.
 * A valley is defined as a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/counting-valleys/problem">...</a>
 */
public class CountingValleys {
    /**
     * This is the main method which makes use of countingValleys method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Path of the hiker
        String path = "UDDDUDUU";
        // Print the number of valleys
        System.out.println(countingValleys(path));
    }

    /**
     * This method counts the number of valleys a hiker has walked through.
     * @param path This is the path of the hiker. 'U' represents a step up and 'D' represents a step down.
     * @return int This returns the number of valleys.
     */
    static int countingValleys(String path) {
        // Initialize the number of valleys and the current level
        int valleys = 0, level = 0;
        // Iterate over the path
        for (char c : path.toCharArray()) {
            // If the current step is up, increment the level
            if (c == 'U') level++;
            // If the current step is down, decrement the level
            if (c == 'D') level--;
            // If the current level is sea level and the current step is up, increment the number of valleys
            if (level == 0 && c == 'U') valleys++;
        }
        // Return the number of valleys
        return valleys;
    }
}