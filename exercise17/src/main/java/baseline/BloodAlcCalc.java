package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodAlcCalc {

    //holds these variables in the object
    private int gender = 0;
    private double ouncesAlc = 0;
    private double weightLbs = 0;
    private double hoursSince = 0;
    private double bloodPercent = 0;

    //getters and setters
    public int getGender() {return gender;}
    public void setGender(int gender) {this.gender = gender;}
    public double getOuncesAlc() {return ouncesAlc;}
    public void setOuncesAlc(double ouncesAlc) {this.ouncesAlc = ouncesAlc;}
    public double getWeightLbs() {return weightLbs;}
    public void setWeightLbs(double weightLbs) {this.weightLbs = weightLbs;}
    public double getHoursSince() {return hoursSince;}
    public void setHoursSince(double hoursSince) {this.hoursSince = hoursSince;}
    public double getBloodPercent() {return bloodPercent;}
    public void setBloodPercent(double bloodPercent) {this.bloodPercent = bloodPercent;}

    //driver method
    public void run(){
        userInfo();
    }

    //gets user info
    //uses try catch to make sure they only enter numbers
    private void userInfo(){
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        while (true) {
            try {Scanner scanner2 = new Scanner(System.in);
               setGender(scanner2.nextInt());
                break;
            } catch (InputMismatchException  ime) {
                System.out.print("Please enter a 1 or 2: ");
            }
        }
        System.out.print("How many ounces of alcohol did you have? ");
        while (true) {
            try {Scanner scanner2 = new Scanner(System.in);
                setOuncesAlc(scanner2.nextDouble());
                break;
            } catch (InputMismatchException  ime) {
                System.out.print("Please enter a number: ");
            }
        }
        System.out.print("What is your weight, in pounds? ");
        while (true) {
            try {Scanner scanner2 = new Scanner(System.in);
                setWeightLbs(scanner2.nextDouble());
                break;
            } catch (InputMismatchException  ime) {
                System.out.print("Please enter a number: ");
            }
        }
        System.out.print("How many hours has it been since your last drink? ");
        while (true) {
            try {Scanner scanner2 = new Scanner(System.in);
                setHoursSince(scanner2.nextDouble());
                break;
            } catch (InputMismatchException  ime) {
                System.out.print("Please enter a number: ");
            }
        }
        calcBloodPercent();
    }

    //calc BAC from class variables
    private void calcBloodPercent(){
        double a = getOuncesAlc();
        double w = getWeightLbs();
        double h = getHoursSince();
        double r;
        if(getGender()==1){
            r = 0.73;
        }else{
            r = 0.66;
        }
        setBloodPercent((a*5.14 / w*r) - (.015*h));
        printResults();
    }

    //prints BAC and determines if its safe to drive
    private void printResults() {
        System.out.printf("Your BAC is %.6f%n", getBloodPercent());
         if(getBloodPercent() > .08) System.out.printf("It is not legal for you to drive.%n");
         else System.out.printf("It is legal for you to drive.%n");
    }
}
