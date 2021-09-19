/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

//set up scanner for input from keyboard

//prompt user for length of room in feet
    //store as double or floating point
//prompt use for width of room in feet
    //store as double or floating point

//use final static variable for feet to meters conversion
    //make it constant
    //m2 = f2 * 0.09290304
    //use double or floating point

//calculate area in feet
    //store as double or floating point

//multiple area in feet by the meter conversion variable
    //store in double or floating point

//print out the dimensions entered
//print area in feet
//print area in meter

import java.util.Scanner;

public class Solution07 {
    static Scanner scanner = new Scanner(System.in);
    final static double meterConversion = 0.09290304;

    public static void main(String[] args) {

//get length in feet
        System.out.print("What is the length of the room in feet? ");
        double lengthFeet = scanner.nextDouble();
//get width in feet
        System.out.print("What is the width of the room in feet? ");
        double widthFeet = scanner.nextDouble();

//calculate area in feet
        double areaFeet = lengthFeet * widthFeet;
//convert area in feet to meters
        double areaMeters = areaFeet * meterConversion;

//print outputs
        System.out.println("You entered dimensions of " + lengthFeet + " feet by " + widthFeet + " feet.");
        System.out.println("The area is ");
        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeters + " square meters");

    }
}
