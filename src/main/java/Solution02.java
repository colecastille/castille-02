/*
UCF COP 3330 Fall 2021 Assignment 2 Solution
Copyright 2021 Cole Castille
 */

// Prompt user "What is the input string?"
// Scan user's <string> input
// Count the length of the string and store it as int <x>
// Print out "<string> has <x> characters."

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = in.nextLine();
        System.out.println(input + " has " + input.length() + " characters.");
    }
}
