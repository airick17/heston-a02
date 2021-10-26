package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalc {

    private double heightInches = 0;
    private double weightPounds = 0;
    private double BMI = 0;

    public double getHeightInches() {return heightInches;}
    public void setHeightInches(double heightInches) {this.heightInches = heightInches;}
    public double getWeightPounds() {return weightPounds;}
    public void setWeightPounds(double weightPounds) {this.weightPounds = weightPounds;}
    public double getBMI() {return BMI;}
    public void setBMI(double BMI) {this.BMI = BMI;}

    public void heightInInchesGet() {
        System.out.print("What is your height in inches? ");
        Scanner scanner = new Scanner(System.in);
        try {
            setHeightInches(scanner.nextDouble());
        }catch (InputMismatchException e){
            System.out.printf("Please enter a number.%n%n");
            heightInInchesGet();
        }
    }

    public void weightInPoundsGet() {
        System.out.print("What is your weight in pounds? ");
        Scanner scanner = new Scanner(System.in);
        try {
            setWeightPounds(scanner.nextDouble());
        }catch (InputMismatchException e){
            System.out.printf("Please enter a number.%n%n");
            weightInPoundsGet();
        }
    }

    public void calcBMI() {
        double weight = getWeightPounds();
        double height = getHeightInches();
        double bmi = (weight / (height * height)) * 703;
        setBMI(bmi);
    }

    public void displayBMI() {
        System.out.printf("Your BMI is %.1f.%n", getBMI());
    }

    public void displayRange() {
        if(getBMI() >= 25){
            System.out.printf("You are overweight. You should see your doctor.%n");
        }else if(getBMI()<= 18.5){
            System.out.printf("You are underweight. You should see your doctor.%n");
        }
        else System.out.printf("You are within the ideal weight range.%n");
    }
}
