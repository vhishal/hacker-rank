package com.vhishal.ramsaransing.easy.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to calculate the fair share of the bill for a meal.
 * * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/bon-appetit/problem">...</a>
 */
public class BonAppetit {
    /**
     * This is the main method which makes use of bonAppetit method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // List of item costs, index of item not eaten by Anna, and amount Anna paid
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
    }

    /**
     * This method calculates the fair share of the bill for Anna and checks if she has been overcharged.
     * @param bill This is the list of costs for each item ordered.
     * @param k This is the index of the item that Anna did not eat.
     * @param b This is the amount that Anna contributed to the bill.
     */
    static void bonAppetit(List<Integer> bill, int k, int b) {
        // Calculate the total cost of the items that Anna ate
        int sum = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k)) / 2;
        // Check if Anna has been overcharged and print the result
        System.out.println(sum == b ? "Bon Appetit" : b - sum);
    }
}