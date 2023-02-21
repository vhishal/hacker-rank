package com.vhishal.ramsaransing.implementation.easy;

import java.util.Scanner;

public class SloveMeFirst {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/solve-me-first/problem
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		System.out.println(solveMeFirst(a, b));
//		System.out.println(solveMeFirst(5, 7)); // Should print 12
	}

	/**
	 * 
	 * Takes both operand and returns the sum. For example 1 + 2 = 3
	 * 
	 * @param a operand
	 * @param b operand
	 * @return sum of a and b
	 */
	static int solveMeFirst(int a, int b) {
		return a + b;
	}

}
