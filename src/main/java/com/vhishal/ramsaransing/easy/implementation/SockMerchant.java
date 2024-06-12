package com.vhishal.ramsaransing.easy.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents a solution for the "Sock Merchant" problem from HackerRank.
 * Problem link: https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class SockMerchant {

    /**
     * The main method which is the entry point of the program.
     * It creates a list of socks and calls the sockMerchant method with this list as input.
     * The result is then printed to the console.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        List<Integer> socks = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20, 50);
        System.out.println(sockMerchant(socks));
    }

    /**
     * This method calculates the number of pairs of socks with the same color.
     * It takes a list of integers representing the colors of each sock and returns the total number of pairs.
     * The method uses a HashMap to count the occurrences of each color and then calculates the number of pairs for each color.
     * The total number of pairs is then returned.
     *
     * @param ar a list of integers representing the colors of each sock
     * @return the total number of pairs of socks with the same color
     */
    static int sockMerchant(List<Integer> ar) {
        Map<Integer, Integer> sockCount = new HashMap<>();
        for (int sock : ar) {
            sockCount.put(sock, sockCount.getOrDefault(sock, 0) + 1);
        }
        return sockCount.values().stream().mapToInt(count -> count / 2).sum();
    }
}