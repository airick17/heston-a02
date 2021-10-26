/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Eric Heston
 */

package baseline;

public class Solution19 {
    public static void main(String[] args) {
        BMICalc bmiCalc = new BMICalc();
        bmiCalc.heightInInchesGet();
        bmiCalc.weightInPoundsGet();
        bmiCalc.calcBMI();
        bmiCalc.displayBMI();
        bmiCalc.displayRange();
    }
}
