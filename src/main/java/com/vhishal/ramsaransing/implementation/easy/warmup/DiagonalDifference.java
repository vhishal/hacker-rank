package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class DiagonalDifference {

	public static final int COUNT_LEFT_TO_RIGHT_DIAGONAL = 1;
	public static final int COUNT_RIGHT_TO_LEFT_DIAGONAL = 2;

	/*
	 * Problem link:
	 * https://www.hackerrank.com/challenges/diagonal-difference/problem
	 */
	public static void main(String[] args) {
		int[][] inputArr = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };

		List<List<Integer>> input = new ArrayList<>();
		for (int[] ints : inputArr) input.add(Arrays.stream(ints).boxed().collect(Collectors.toList()));

		System.out.println(diagonalDifference(input));
	}

	/**
	 * Given a square matrix, calculates the absolute difference between the sums of
	 * its diagonals. For example is the input is [[11, 2, 4], [4, 5, 6], [10, 8,
	 * -12]] the output will be 15
	 * 
	 * @param squareMatrix a list with lists of {@link Integer} value's
	 * @return int difference between diagonals
	 */
	private static int diagonalDifference(List<List<Integer>> squareMatrix) {
		int output = 0;
		if (!squareMatrix.isEmpty()) {
			int leftDiagonal = calculateDiagonal(squareMatrix, COUNT_LEFT_TO_RIGHT_DIAGONAL);
			int rightDiagonal = calculateDiagonal(squareMatrix, COUNT_RIGHT_TO_LEFT_DIAGONAL);
			if (leftDiagonal > rightDiagonal) {
				output = leftDiagonal - rightDiagonal;
			} else {
				output = rightDiagonal - leftDiagonal;
			}
		}
		return output;
	}

	/**
	 * Given a square matrix, calculates the sums of its diagonals. For example is
	 * the input is [[11, 2, 4], [4, 5, 6], [10, 8, -12]] the output will be 4 for
	 * the left to right diagonal and 19 for the right to left diagonal.
	 * 
	 * @param squareMatrix a list with lists of {@link Integer} value's
	 * @param option int specifies the option for which diagonal the calculation should take place
	 * @return int the sum of one of the diagonals
	 */
	private static int calculateDiagonal(List<List<Integer>> squareMatrix, int option) {
		int index = 0;
		if (option == COUNT_RIGHT_TO_LEFT_DIAGONAL)
			index = squareMatrix.size() - 1;
		int sum = 0;
		for (List<Integer> integerList : squareMatrix) {
			sum += integerList.get(index);
			if (option == COUNT_LEFT_TO_RIGHT_DIAGONAL) {
				index++;
			} else if (option == COUNT_RIGHT_TO_LEFT_DIAGONAL) {
				index--;
			}
		}
		return sum;
	}

}
