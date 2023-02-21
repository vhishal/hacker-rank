package com.vhishal.ramsaransing.implementation.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vhishal
 *
 */
public class SimpleArraySum {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/simple-array-sum/problem
	 */
	public static void main(String[] args) {
		List<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(10);
		input.add(11);		
		System.out.println(simpleArraySum(input)); // Should print 31
	}

	/**
	 * Takes a list of Integers and returns the sum of this array. 
	 * For example input [1, 2, 3, 4, 10, 11] output 31
	 * 
	 * @param input {@link Integer} {@link List}
	 * @return sum of input {@link Integer} {@link List}
	 */
	static int simpleArraySum(List<Integer> input) {
		return input.stream().mapToInt(i->i).sum();
	}

}
