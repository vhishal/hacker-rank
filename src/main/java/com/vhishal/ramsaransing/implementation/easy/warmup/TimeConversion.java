package com.vhishal.ramsaransing.implementation.easy.warmup;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * This class represents a solution to the problem of converting a time from 12-hour format to 24-hour format.
 * The problem is described in detail at: https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion {

    /**
     * The main method initializes the time in 12-hour format and calls the method to convert it to 24-hour format.
     *
     * @param args command line arguments, not used in this program
     */
    public static void main(String[] args) {
        String time = "12:00:00am";
        System.out.println(timeConversion(time));
    }

    /**
     * This method converts a time from 12-hour format to 24-hour format.
     * It uses the Java DateTimeFormatter and LocalTime classes to parse the input time, convert it, and format the output time.
     *
     * @param time a string representing the time in 12-hour format
     * @return a string representing the time in 24-hour format
     */
    static String timeConversion(String time) {
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(time, inputFormat);
        return outputFormat.format(localTime);
    }
}