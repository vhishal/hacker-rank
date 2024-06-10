package com.vhishal.ramsaransing.easy.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to solve the Angry Professor problem.
 * The problem is to determine whether a class is cancelled or not based on the number of students who arrived on time.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/angry-professor/problem">...</a>
 */
public class AngryProfessor {
    /**
     * This is the main method which makes use of angryProfessor method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // List of students' arrival times
        List<Integer> a = Arrays.asList(-1, -3, 4, 2);
        // Print whether the class is cancelled or not
        System.out.println(angryProfessor(3, a));
        // Another list of students' arrival times
        List<Integer> b = Arrays.asList(0, -1, 2, 1);
        // Print whether the class is cancelled or not
        System.out.println(angryProfessor(2, b));
    }

    /**
     * This method determines whether a class is cancelled or not.
     * A class is cancelled if the number of students who arrived on time is less than a certain threshold.
     * @param minimumStudents The minimum number of students who need to arrive on time for the class to not be cancelled.
     * @param students A list of integers representing the arrival times of the students. A non-positive value means the student arrived on time, while a positive value means the student arrived late.
     * @return String This returns "YES" if the class is cancelled and "NO" if it is not.
     */
    static String angryProfessor(int minimumStudents, List<Integer> students) {
        // Count the number of students who arrived on time and check if it is less than the threshold
        return students.stream().filter(student -> student <= 0).count() >= minimumStudents ? "NO" : "YES";
    }
}