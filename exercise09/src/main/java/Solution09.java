/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */

//set up scanner

//create static final variable for conversion factor of 1 gallon = 350 square feet of coverage

//print welcome message
//prompt user to enter length and width of ceiling
    //use scanner to get user data from keyboard
        //scanner.nextDouble()
    //store length and width as doubles

//calculate area of ceiling
    //double areaCeiling = length * width

//calculate gallons needed
   //double gallonsNeeded = areaCeiling / squareFeetPerGallon

//round up
    //use Math.ceil
    //int roundedGallonsNeeded = Math.ceil(gallonsNeeded)


import java.util.Scanner;
public class Solution09 {

    static Scanner scanner = new Scanner(System.in);
    static final int squareFeetPerGallon = 350;

    public static void main(String[] args) {

        //welcome
        System.out.println("Welcome to the ceiling paint calculator!");

        //gathering user data
        System.out.print("Enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the room: ");
        double width = scanner.nextDouble();

        //calculate area
        double area = length * width;

        //calculate gallons needed
        double gallonsNeeded = area / squareFeetPerGallon;
        //round gallons needed up to next whole number
            //cast rounded double to int to get rid of decimal
        int roundedGallonsNeeded = (int) Math.ceil(gallonsNeeded);

        //prints
        System.out.print("You will need to purchase " + roundedGallonsNeeded + " gallons of paint to cover " + area + " square feet." );

    }
}
