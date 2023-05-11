package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class BirthdayCakeCandles {

	/*
	 * Problem
	 * link:https://www.hackerrank.com/challenges/birthday-cake-candles/problem
	 */

	public static void main(String[] args) {
		int[] input = { 5, 6, 7, 4, 4, 6, 7, 7 };
		List<Integer> candles = Arrays.stream(input).boxed().collect(Collectors.toList());
		System.out.println(birthdayCakeCandles(candles));
	}

	/**
	 * Takes a {@code List<Integer>} and returns the number of occurrence of the highest number.
	 * For example if the input is { 5, 6, 7, 4, 4, 6, 7, 7} the output will be 3
	 * 
	 * @param candles a list of {@link Integer} value's
	 * @return count of the highest number in the list
	 */
	static int birthdayCakeCandles(List<Integer> candles) {
		candles.sort(Collections.reverseOrder());
		return Collections.frequency(candles, candles.get(0));
	}
}
