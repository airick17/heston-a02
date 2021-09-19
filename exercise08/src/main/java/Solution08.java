/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */

//set up scanner

//prompt user for inputs
    //How many people?
        //store as int people
    //How many pieces of pizza do you have?
        //store as int pies
    //How many slices per pizza?
        //store as int slices

//calculate number of pieces each person gets if there are leftovers
    //calculate total slices and store
        //int totalSlices = pies * slices
    //calculate slicesPerPerson to an even number per person
        //int slicesPerPerson = totalSlices / people

    //calculate leftOvers
        // int leftOvers = totalSlices % people

//display number of pieces per person and leftovers
    //print statements

import java.util.Scanner;
public class Solution08 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //gathering
        //people
        System.out.print("How many people? ");
        int people = scanner.nextInt();
        //pies
        System.out.print("How many pizzas do you have? ");
        int pies = scanner.nextInt();
        //slices
        System.out.print("How many slices per pizza? ");
        int slices = scanner.nextInt();

        //calculations
        int totalSlices = pies * slices;
        int slicesPerPerson = totalSlices / people;
        int leftovers = totalSlices % people;

        //prints
        System.out.println(people + " people with " + pies + " pizzas "+ "(" + totalSlices + " slices)" );
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");

    }
}
