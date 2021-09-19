/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */

//scanner
//make constant for tax rate

//get price of item 1 and the quantity
//get price of item 2 and the quantity
//get price of item 3 and the quantity
    //store these as doubles?

//calculate
    //use doubles?
    //subtotal = (item1 * quantity1) + (item2 * quantity2) + (item3 * quantity3)
    //tax = subtotal * tax rate
    //total = subtotal + tax
    //round two hundredths of penny

//string build

import java.util.Scanner;

public class Solution10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //get item 1 and parse for double
        System.out.print("Enter price of item 1: ");
        String firstItemInput = scanner.next();
        double firstItem = Double.parseDouble(firstItemInput);
        //System.out.println(firstItem);

        //get item 1 quantity and parse for int
        System.out.print("Enter the quantity of item 1: ");
        String firstItemQuantityInput = scanner.next();
        int firstItemQuantity = Integer.parseInt(firstItemQuantityInput);
        //System.out.println(firstItemQuantity);

        //get item 2 and parse for double
        System.out.print("Enter price of item 2: ");
        String secondItemInput = scanner.next();
        double secondItem = Double.parseDouble(secondItemInput);
        //System.out.println(secondItem);

        //get item 2 quantity and parse for int
        System.out.print("Enter the quantity of item 2: ");
        String secondItemQuantityInput = scanner.next();
        int secondItemQuantity = Integer.parseInt(secondItemQuantityInput);
        //System.out.println(secondItemQuantity);

        //get item 3 and parse for double
        System.out.print("Enter price of item 3: ");
        String thirdItemInput = scanner.next();
        double thirdItem = Double.parseDouble(thirdItemInput);
        //System.out.println(thirdItem);

        //get item 3 quantity and parse for int
        System.out.print("Enter the quantity of item 3: ");
        String thirdItemQuantityInput = scanner.next();
        int thirdItemQuantity = Integer.parseInt(thirdItemQuantityInput);
        //System.out.println(thirdItemQuantity);

        //calculate subtotal
        double subtotal = (firstItem*firstItemQuantity) + (secondItem*secondItemQuantity) + (thirdItem*thirdItemQuantity);
        //calculate tax
        double tax = subtotal * 0.055;
        //calculate total
        double total = subtotal + tax;

        //pass doubles to print constructor
        Print print = new Print(subtotal,tax,total);
        
    }

}
