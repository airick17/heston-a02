package baseline;

import java.util.Scanner;

public class DriverAge {
    //holds driver age for compare function later
    private int driverAge;

    //getters and setters
    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    //ask for and sets user input to driver age
    public void askAge() {
        System.out.print("What is your age? ");
        Scanner scanner = new Scanner(System.in);
        setDriverAge(scanner.nextInt());
    }

    //boolean is true if driver is over 16 or is 16 and false if under
    private boolean compare(int driverAge) {
        if(driverAge >= 16){
            return true;
        }else
            return false;
    }

    //calls compare on the driver age and prints appropriate statement
    public void printResults() {
        if(compare(getDriverAge())){
            System.out.println("You are old enough to legally drive.");
        }else{
            System.out.println("You are not old enough to legally drive.");
        }
    }
}

