package baseline;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class NumberCompare {
    //Holds 2 ints
    private int firstNum;
    private int secondNum;
    private int thirdNum;

    //getter setters
    public int getFirstNum() {return firstNum;}
    public void setFirstNum(int firstNum) {this.firstNum = firstNum;}
    public int getSecondNum() {return secondNum;}
    public void setSecondNum(int secondNum) {this.secondNum = secondNum;}
    public int getThirdNum() {return thirdNum;}
    public void setThirdNum(int thirdNum) {this.thirdNum = thirdNum;}


    //main start up method
    public void doEverything() {
        userNumbersEntry();
        findLargestNum();
        printLargestNum();
    }

    //gets users nums
    private void userNumbersEntry() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        setFirstNum(sc.nextInt());
        System.out.print("Enter the second number: ");
        setSecondNum(sc.nextInt());
        System.out.print("Enter the third number: ");
        setThirdNum(sc.nextInt());
    }

    //finds largest num out of the 3
    //found this easy way to call max on 3 nums
    private int findLargestNum() {
        return (int) DoubleStream.of(getFirstNum(), getSecondNum(), getThirdNum()).max().getAsDouble();
    }

    //prints output to user
    private void printLargestNum() {
        System.out.printf("The largest number is %d.%n", findLargestNum());
    }
}
