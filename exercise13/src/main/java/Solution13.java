/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */

public class Solution13 {
    public static void main(String[] args) {

        //user prompts and input data
        double principal = Get.principalInput();
        double interestRate = Get.interestRateInput();
        double numYears = Get.numYears();
        double compoundPerYear = Get.compoundPerYear();

        //calculate and print
        Calculate.calculate(principal,interestRate,numYears,compoundPerYear);

    }
}
