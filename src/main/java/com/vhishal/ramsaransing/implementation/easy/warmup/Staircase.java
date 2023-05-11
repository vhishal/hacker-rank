package com.vhishal.ramsaransing.implementation.easy.warmup;

/**
 * @author Vhishal
 *
 */
public class Staircase {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/staircase/problem
	 */
	public static void main(String[] args) {
		staircase(10);
	}

	/**
	 * Takes an int as input and prints a "staircase".
	 * 
	 * @param input int number of steps
	 */
	static void staircase(int input) {
		for (int i = 0; i < input; i++) {
			String sb = " ".repeat(Math.max(0, input - 1 - i)) +
					"#".repeat(i + 1);
			System.out.println(sb);
		}
	}
}
