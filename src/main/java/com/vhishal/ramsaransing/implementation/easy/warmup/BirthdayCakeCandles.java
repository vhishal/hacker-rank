package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class represents a solution to the problem of finding the number of the tallest candles on a birthday cake.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/birthday-cake-candles/problem">...</a>
 */
public class BirthdayCakeCandles {

    /**
     * The main method initializes the list of candle heights and calls the method to solve it.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(5, 6, 7, 4, 4, 6, 7, 7);
        System.out.println(birthdayCakeCandles(candles));
    }

    /**
     * This method finds the tallest candle on the cake and counts how many candles have that height.
     * It uses the Java Collections API to find the maximum value in the list and the Stream API to count the frequency of the tallest candle.
     *
     * @param candles a list of candle heights
     * @return the number of the tallest candles
     */
    static long birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        return candles.stream().filter(i -> i == max).count();
    }
}