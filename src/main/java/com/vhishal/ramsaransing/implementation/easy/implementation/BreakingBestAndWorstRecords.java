package com.vhishal.ramsaransing.implementation.easy.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to find out how many times a player breaks their highest and lowest scores in a game.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem">...</a>
 */
public class BreakingBestAndWorstRecords {
    /**
     * This is the main method which makes use of breakingRecords method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // List of scores
        List<Integer> scores = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
        // Print the result of breakingRecords method
        System.out.println(breakingRecords(scores));
    }

    /**
     * This method is used to find out how many times a player breaks their highest and lowest scores.
     * @param scores This is the list of scores.
     * @return List<Integer> This returns a list with two elements. The first element is the count of times the player broke their highest score and the second element is the count of times the player broke their lowest score.
     */
    static List<Integer> breakingRecords(List<Integer> scores) {
        // Initialize highScore and lowScore with the first score
        int highScore = scores.get(0), lowScore = scores.get(0), brokeHigh = 0, brokeLow = 0;
        // Iterate over the scores
        for (int score : scores) {
            // Check if the current score is higher than the current highScore
            if (score > highScore) {
                // Increment the counter for breaking high score and update the highScore
                brokeHigh++;
                highScore = score;
            }
            // Check if the current score is lower than the current lowScore
            else if (score < lowScore) {
                // Increment the counter for breaking low score and update the lowScore
                brokeLow++;
                lowScore = score;
            }
        }
        // Return the counts of breaking high and low scores
        return Arrays.asList(brokeHigh, brokeLow);
    }
}