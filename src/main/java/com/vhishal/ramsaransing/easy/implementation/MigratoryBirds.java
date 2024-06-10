package com.vhishal.ramsaransing.easy.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This class is used to solve the Migratory Birds problem.
 * The problem is to find the most common bird type in a list of bird sightings.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/migratory-birds/problem">...</a>
 */
public class MigratoryBirds {
    /**
     * This is the main method which makes use of migratoryBirds method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // List of bird IDs
        List<Integer> birdIds = Arrays.asList(1, 4, 4, 4, 5, 3);
        // Print the most common bird ID
        System.out.println(migratoryBirds(birdIds));
    }

    /**
     * This method finds the most common bird type in a list of bird sightings.
     * @param birdIds This is the list of bird IDs. Each bird ID represents a type of bird.
     * @return int This returns the most common bird ID. If there are multiple bird IDs that are the most common, it returns the smallest one.
     */
    static int migratoryBirds(List<Integer> birdIds) {
        // Count the occurrences of each bird ID
        Map<Integer, Long> birdCount = birdIds.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Find the bird ID with the highest count
        return birdCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}