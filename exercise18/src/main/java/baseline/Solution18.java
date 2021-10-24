/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solutions
 *  Copyright 2021 Eric Heston
 */
package baseline;

public class Solution18 {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();
        tempConverter.printInstructions();
        tempConverter.askChoice();
        tempConverter.askTemp();
        tempConverter.printResults();

    }
}
