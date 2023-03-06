package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class PlusMinus {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/plus-minus/problem
	 */
	public static void main(String[] args) {
		int[] inputArr = { -4, 3, -9, 0, 4, 1 };
		List<Integer> input = Arrays.stream(inputArr).boxed().collect(Collectors.toList());
		plusMinus(input);
	}

	/**
	 * Takes a {@code List<Integer>} and calculates how many zero's, positives and
	 * negatives there are compared to the size of the {@code List} and prints this. For
	 * example if the input is [-4, 3, -9, 0, 4, 1] the method will print' 0.500000,
	 * 0.333333 and 0.166667'
	 * 
	 * @param input a list of {@link Integer} value's
	 */
	static void plusMinus(List<Integer> input) {
		double size = input.size();
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for (int value : input) {
			if (value > 0) {
				pos++;
			} else if (value < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		DecimalFormat dcf = new DecimalFormat("0.000000");
		System.out.println(dcf.format(pos / size));
		System.out.println(dcf.format(neg / size));
		System.out.println(dcf.format(zero / size));
	}
}
