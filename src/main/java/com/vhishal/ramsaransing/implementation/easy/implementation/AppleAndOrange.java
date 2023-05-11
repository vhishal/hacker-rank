package com.vhishal.ramsaransing.implementation.easy.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vhishal
 *
 */
public class AppleAndOrange {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/apple-and-orange/problem
	 */
	public static void main(String[] args) {
		int houseStart = 7;
		int houseEnd = 10;
		int appleTree = 4;
		int orangeTree = 12;
		int[] apples = { 2, 3, -4 };
		List<Integer> appelsList = Arrays.stream(apples).boxed().collect(Collectors.toList());
		int[] oranges = { 3, -2, -4 };
		List<Integer> orangesList = Arrays.stream(oranges).boxed().collect(Collectors.toList());
		countApplesAndOranges(houseStart, houseEnd, appleTree, orangeTree, appelsList, orangesList);
	}

	/**
	 * This method takes 6 parameters. The first 2 elements are ints used to
	 * indicate the start and end position of an object (House). The following 2
	 * parameters are ints used to indicate the absolute position of 2 different
	 * objects (trees) and the last 2 elements are {@code List<Integer>} to indicate the
	 * relative positions of objects (fruits) compared to the previous 2 absolute
	 * object (trees) positions. The method calculates the absolute position of the
	 * object of the 2 {@code List<Integer>} and prints how many objects are in the same space
	 * as the first object (House). For example if the input is 7, 10, 4, 12, [2,
	 * 3, -4] and [3, -2, -4] the method will print 1 and 2.
	 * 
	 * @param houseStart  int
	 * @param houseEnd    int
	 * @param appleTree   int
	 * @param orangeTree  int
	 * @param applesList  a list of {@link Integer} value's
	 * @param orangesList a list of {@link Integer} value's
	 */
	static void countApplesAndOranges(int houseStart, int houseEnd, int appleTree, int orangeTree,
			List<Integer> applesList, List<Integer> orangesList) {

		List<Integer> applesPosition = applesList.stream().map(apple -> apple + appleTree).toList();
		int fallenAppelsCounter = 0;
		for (Integer applePosition : applesPosition) {
			if (houseStart <= applePosition && applePosition <= houseEnd) {
				fallenAppelsCounter++;
			}
		}
		
		List<Integer> orangesPosition = orangesList.stream().map(orange -> orange + orangeTree).toList();
		int fallenOrangesCounter = 0;
		for (Integer orangePosition : orangesPosition) {
			if (houseStart <= orangePosition && orangePosition <= houseEnd) {
				fallenOrangesCounter++;
			}
		}
		
		System.out.println(fallenAppelsCounter);
		System.out.println(fallenOrangesCounter);
	}

}
