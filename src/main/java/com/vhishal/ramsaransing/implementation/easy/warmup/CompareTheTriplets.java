package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class CompareTheTriplets {

	/*
	 * Problem link:
	 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
	 */
	public static void main(String[] args) {
		int[] arrA = { 17, 28, 30 };
		int[] arrB = { 99, 16, 8 };
		/* Convert the Arrays to Lists */
		List<Integer> a = Arrays.stream(arrA).boxed().collect(Collectors.toList());
		List<Integer> b = Arrays.stream(arrB).boxed().collect(Collectors.toList());

		System.out.println(compareTriplets(a, b)); // should print [2,1]
	}

	/**
	 * Takes 2 {@code Integer} {@code Lists} of equal size and compares the
	 * elements. The element (0) of the first list(a) is compared with the element
	 * (0) of the second list(b). If an is bigger than b then one is added to the
	 * score of a, if b is bigger than a then one is added to the score of b. If
	 * they are equal then no score is added. the return is a list with the scores
	 * of a and b. For example input {17, 28, 30}, { 99, 16, 8 } Output = [2,1]
	 * 
	 * @param a a list of {@link Integer} value's
	 * @param b a list of {@link Integer} value's
	 * @return result a list of 2 {@link Integer} value's
	 */
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
		if (!a.isEmpty() && !b.isEmpty() && a.size() == b.size()) {
			int scoreA = 0;
			int scoreB = 0;
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i) > b.get(i))
					scoreA++;
				else if (a.get(i) < b.get(i))
					scoreB++;
			}
			result.add(scoreA);
			result.add(scoreB);
		}
		return result;
	}
}
