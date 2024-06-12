package com.vhishal.ramsaransing.easy.implementation;

/**
 * This class represents a solution for the "Cats and a Mouse" problem from HackerRank.
 * Problem link: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class CatsAndMouse {

    /**
     * The main method which is the entry point of the program.
     * It calls the catAndMouse method with sample inputs and prints the result.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 3, 2));
    }

    /**
     * This method determines which cat will catch the mouse, or whether the mouse will escape.
     * It takes the positions of two cats and a mouse and returns a string indicating the outcome.
     * If both cats are equidistant from the mouse, it returns "Mouse C" indicating the mouse escapes.
     * Otherwise, it returns "Cat A" or "Cat B" indicating which cat catches the mouse.
     *
     * @param x the position of Cat A
     * @param y the position of Cat B
     * @param z the position of the mouse
     * @return a string indicating which cat catches the mouse, or whether the mouse escapes
     */
    static String catAndMouse(int x, int y, int z) {
        int cat1Mouse = Math.abs(z - x);
        int cat2Mouse = Math.abs(z - y);
        if (cat1Mouse == cat2Mouse) {
            return "Mouse C";
        }
        return cat1Mouse < cat2Mouse ? "Cat A" : "Cat B";
    }
}