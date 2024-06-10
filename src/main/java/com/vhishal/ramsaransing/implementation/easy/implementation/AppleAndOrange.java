package com.vhishal.ramsaransing.implementation.easy.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a solution to the problem of counting apples and oranges that fall within a certain range.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/apple-and-orange/problem">...</a>
 */
public class AppleAndOrange {

    /**
     * The main method initializes the parameters for the problem and calls the method to solve it.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        int houseStart = 7;
        int houseEnd = 10;
        int appleTree = 4;
        int orangeTree = 12;
        List<Integer> apples = Arrays.asList(2, 3, -4);
        List<Integer> oranges = Arrays.asList(3, -2, -4);
        countApplesAndOranges(houseStart, houseEnd, appleTree, orangeTree, apples, oranges);
    }

    /**
     * This method counts the number of apples and oranges that fall within the range of the house.
     * It uses the Java Stream API to perform the calculations in a functional style.
     *
     * @param houseStart the starting position of the house
     * @param houseEnd   the ending position of the house
     * @param appleTree  the position of the apple tree
     * @param orangeTree the position of the orange tree
     * @param apples     a list of distances that the apples fall from the apple tree
     * @param oranges    a list of distances that the oranges fall from the orange tree
     */
    static void countApplesAndOranges(int houseStart, int houseEnd, int appleTree, int orangeTree, List<Integer> apples, List<Integer> oranges) {
        long fallenApplesCounter = apples.stream().map(apple -> apple + appleTree).filter(applePosition -> houseStart <= applePosition && applePosition <= houseEnd).count();
        long fallenOrangesCounter = oranges.stream().map(orange -> orange + orangeTree).filter(orangePosition -> houseStart <= orangePosition && orangePosition <= houseEnd).count();
        System.out.println(fallenApplesCounter);
        System.out.println(fallenOrangesCounter);
    }
}