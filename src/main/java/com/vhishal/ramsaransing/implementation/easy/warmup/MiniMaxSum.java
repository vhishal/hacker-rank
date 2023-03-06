package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class MiniMaxSum {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/mini-max-sum/problem
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		List<Integer> input = Arrays.stream(arr).boxed().collect(Collectors.toList());
		miniMaxSum(input);
		int[] arr2 = { 793810624, 895642170, 685903712, 623789054, 468592370 };
		List<Integer> input2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		miniMaxSum(input2);
	}

	/**
	 * Takes a a {@code list<Integers>} and calculates the minimum and maximum sum
	 * using n-1 elements. The results are printed. For example if the input is [1,
	 * 2, 9, 4, 5] the method will print '12 20'
	 * 
	 * @param input a list of 5 {@link Integer} value's
	 */
	static void miniMaxSum(List<Integer> input) {
		Collections.sort(input);
		long min = 0;
		long max = 0;
		for (int i = 0; i < input.size(); i++) {
			int currentValue = input.get(i);
			// The first element should only be added to the min
			if (i == 0) {
				min += currentValue;
				// The last element should only be added to the max
			} else if (i == (input.size() - 1)) {
				max += currentValue;
			} else {
				min += currentValue;
				max += currentValue;
			}
		}
		System.out.println(min + " " + max);
	}
}
