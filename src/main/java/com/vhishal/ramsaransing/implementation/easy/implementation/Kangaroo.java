package com.vhishal.ramsaransing.implementation.easy.implementation;

/**
 * @author Vhishal
 *
 */
public class Kangaroo {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/kangaroo/problem
	 */
	public static void main(String[] args) {
		int position = 0;
		int rate = 3;
		int position2 = 4;
		int rate2 = 2;
		System.out.println(kangaroo(position, rate, position2, rate2));
	}

	/**
	 * This methods takes 4 parameters, the first a int indicating the start of the
	 * first kangaroo, the second parameter a int indicating the velocity of the
	 * jump of the first kangaroo, the third parameter a int indicating the start of
	 * the second kangaroo and the fourth parameter a int indicating the velocity of
	 * the jump of the second kangaroo. If the kangaroo land on the same space after
	 * the same number of jumps the method will return "YES", otherwise it will
	 * return "NO". For example if the input is 0, 3, 4, 2 the output will be "YES".
	 * 
	 * @param position  int
	 * @param rate      int
	 * @param position2 int
	 * @param rate2     int
	 * @return output {@link String}
	 */
	private static String kangaroo(int position, int rate, int position2, int rate2) {
		String output = "NO";
		int limit = 10000;
		for (int i = 0; i < limit; i++) {
			position += rate;
			position2 += rate2;
			if (position == position2) {
				output = "YES";
				break;
			}
		}
		return output;
	}
}
