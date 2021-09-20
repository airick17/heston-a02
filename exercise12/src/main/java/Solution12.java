/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */

//prompt user to enter the principal
    //get user input from scanner keyboard
    //store as double principal
//prompt user to enter the rate of interest
    //get user input from scanner keyboard
    //store as double interestRate
//prompt user to enter the number of years invested
    //get user input from scanner keyboard
    //store as double numYears

//calculate investment amount at end of number of years
    //double amountFinal = principal * (1+(interestRate*numYears))

//print the final amount

public class Solution12 {
    public static void main(String[] args) {

        //user prompts and input data
        double principal = Get.principalInput();
        double interestRate = Get.interestRateInput();
        double numYears = Get.numYears();

        //calculate
         double amountFinal = principal*interestRate*numYears + principal;

         //print
        System.out.printf("After %.0f years at %f%%, the investment will be worth $%.2f", numYears,interestRate*100,Math.ceil(amountFinal*100.0)/100.0);
    }
}
