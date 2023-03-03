package com.vhishal.ramsaransing.implementation.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class SimpleArraySum {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/simple-array-sum/problem
	 */
	public static void main(String[] args) {
		int[] inputArr = { 1, 2, 3, 4, 10, 11 };
		List<Integer> input = Arrays.stream(inputArr).boxed().collect(Collectors.toList());
		System.out.println(simpleArraySum(input)); // Should print 31
	}

	/**
	 * Takes a list of Integers and returns the sum of this list. For example input
	 * [1, 2, 3, 4, 10, 11] output 31
	 * 
	 * @param input {@link List}<{@link Integer}> 
	 * @return sum of input
	 */
	static int simpleArraySum(List<Integer> input) {
		return input.stream().mapToInt(i -> i).sum();
	}

}
