package com.vhishal.ramsaransing.implementation.easy.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class GradingStudents {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/grading/problem
	 */
	public static void main(String[] args) {
		int[] grades = { 73, 67, 38, 33 };
		List<Integer> gradesList = Arrays.stream(grades).boxed().collect(Collectors.toList());
		System.out.println(gradingStudents(gradesList));
	}

	/**
	 * The method takes a {@code List<Integer>} and uses the map function to update
	 * the grades. For example if the input is [73, 67, 38, 33] the output will be
	 * [75, 67, 40, 33]
	 * 
	 * @param grades a list of {@link Integer} value's
	 * @return output list of {@link Integer} value's
	 */
	static List<Integer> gradingStudents(List<Integer> grades) {
		return grades.stream().map(grade -> checkAndUpdateGrade(grade)).collect(Collectors.toList());
	}

	/**
	 * This method takes an int and checks if it should be rounded up to a multiple
	 * of 5. The rules are if a value is lower or equal to 38 nothing happens. And If
	 * the difference between the value the and the next multiple of 5 is less than
	 * 3, round the value up to the next multiple of 5
	 * 
	 * @param grade {@link Integer}
	 * @return new grade {@link Integer}
	 */
	private static Integer checkAndUpdateGrade(Integer grade) {
		if (grade >= 38) {
			int diff = 5 - grade % 5;
			if (diff < 3) {
				return grade + diff;
			}
		}
		return grade;
	}

}
