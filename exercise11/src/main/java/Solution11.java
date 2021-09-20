/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */

//prompt user to enter how many euros are being exchanged
    //get input using scanner and keyboard
    //store as a double amountInEuros

//prompt user for the exchange rate
    //get input using scanner and keyboard
    //store as a double exchangeRate

//perform calculations
    //double amountInDollars = amountInEuros * exchangeRate
    //round fraction of a penny up

//print statement

public class Solution11 {
    public static void main(String[] args) {

        Prompt.promptUserEuros();
        double amountInEuros = Get.getEuros();
        Prompt.promptUserRate();
        double conversionRate = Get.getRate();
        double amountInDollars = Get.getDollars(amountInEuros, conversionRate);

        System.out.printf("%.2f euros at an exchange rate of %f is \n" +
                "%.2f U.S. dollars.", amountInEuros, conversionRate,  Math.ceil(amountInDollars*100.0)/100.0);

    }
}
