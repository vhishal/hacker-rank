package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class AveryBigSum {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/a-very-big-sum/problem
	 */

	public static void main(String[] args) {
		long[] inputArr = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };
		List<Long> input = Arrays.stream(inputArr).boxed().collect(Collectors.toList());
		System.out.println(aVeryBigSum(input));
	}

	/**
	 * Takes a {@code List<Long>} and returns the sum of this List. For example input
	 * [1000000001, 1000000002, 1000000003, 1000000004, 1000000005] output
	 * 5000000015
	 * 
	 * @param input a list of {@link Long} value's
	 * @return sum of the input
	 */
	static long aVeryBigSum(List<Long> input) {
		return (long) input.stream().mapToLong(i -> i).sum();
	}

}
