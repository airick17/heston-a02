/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */


//ask user for age
//get the age from keyboard
    //store as currentAge

//ask user for desired retirement age
//get the desired retirement age from keyboard
    //store as desiredAgeRetire

//get the current year from the computer
    //store as number currentYear

//calculate how many years until retirement
    //subtract desiredAgeRetire from currentAge
        //store as number yearsUntilRetire

//add yearsUntilRetire to currentYear
    //store this number as retirementYear

//build output string two lines
    //print ...yearsUntilRetire...
    //print ...currentYear...+retirementYear

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

 class Solution06 {
    static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) {

         //getting user data
        System.out.print("What is your current age? ");
        int currentAge = scanner.nextInt();
        System.out.print("At what age would you like to retire? ");
        int desiredAgeRetire = scanner.nextInt();

        //getting date from computer
         Calendar calendar = new GregorianCalendar();
         int currentYear = calendar.get(Calendar.YEAR);

         //calculate retirement
         int yearsUntilRetire = desiredAgeRetire - currentAge;
         int retirementYear =  currentYear + yearsUntilRetire;

         //output
         System.out.println("You have " + yearsUntilRetire + " years left until you can retire.");
         System.out.println("It's " + currentYear +", so you can retire in " + retirementYear + ".");

     }
}
