package com.vhishal.ramsaransing.easy.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * This class represents a solution to the problem of grading students.
 * The problem is described in detail at: <a href="https://www.hackerrank.com/challenges/grading/problem">...</a>
 */
public class GradingStudents {

    /**
     * The main method initializes the grades for the students and calls the method to solve it.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(grades));
    }

    /**
     * This method updates the grades of the students according to the rules.
     * It uses the Java Stream API to perform the calculations in a functional style.
     *
     * @param grades a list of original grades of the students
     * @return a list of updated grades of the students
     */
    static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(GradingStudents::checkAndUpdateGrade).toList();
    }

    /**
     * This method checks and updates a single grade according to the rules.
     *
     * @param grade the original grade
     * @return the updated grade
     */
    private static Integer checkAndUpdateGrade(Integer grade) {
        if (grade < 38) return grade;
        int diff = 5 - grade % 5;
        return diff < 3 ? grade + diff : grade;
    }
}