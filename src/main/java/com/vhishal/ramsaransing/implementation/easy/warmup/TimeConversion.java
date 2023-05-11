package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Vhishal
 *
 */
public class TimeConversion {

	/*
	 * Problem link: https://www.hackerrank.com/challenges/time-conversion/problem
	 */
	public static void main(String[] args) {
		String time = "12:00:00am";
		System.out.println(timeConversion(time));
	}

	/**
	 * Takes a {@code String} input of time in AM/PM and returns the time in 24-hour
	 * String format. For example input is '12:00:00AM' and the output is '00:00:00'
	 * 
	 * @param time {@link String} in AM/PM
	 * @return {@link String} time in 24 hour
	 */
	static String timeConversion(String time) {
		Date inputTime = null;
		try {
			SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
			inputTime = parseFormat.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		return displayFormat.format(inputTime);
	}

}
