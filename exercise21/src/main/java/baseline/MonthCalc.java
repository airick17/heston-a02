package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthCalc {

    //month num from user and month string from calc
    private int monthNum = 0;
    private String monthString = "";

    //calendar built into MonthCalc object 0-12 null-december
    final String[] calender = {"null", "January", "February", "March", "April", "May", "June", "July", "August",
                               "September", "October", "November", "December"};

    //getter setters
    public String getMonthString() {return monthString;}
    public void setMonthString(String monthString) {this.monthString = monthString;}
    public int getMonthNum() {return monthNum;}
    public void setMonthNum(int monthNum) {this.monthNum = monthNum;}

    //main method
    public void doTheThing() {
        userTheNumber();
        printMonth();
    }

    //gets number from user
    //makes sure it is a number
    private void userTheNumber() {
        System.out.printf("%nPlease enter the number of the month: ");
        Scanner sc = new Scanner(System.in);
        try {
            setMonthNum(sc.nextInt());
        }catch (InputMismatchException e){
            System.out.printf("%nOnly enter a numbers 1-12");
            userTheNumber();
        }
    }

    //prints month and gets month from object
    private void printMonth(){
        calcMonthString();
        System.out.printf("The name of the month is %s.%n", getMonthString());
    }

    //gets monthNum and uses it to call correct array index and then sets monthString appropriately
    private void calcMonthString() {
        setMonthString(calender[getMonthNum()]);
    }
}
