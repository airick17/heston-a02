package baseline;

import java.util.Locale;
import java.util.Scanner;

public class MultiStateTaxCalc {

    //objects properties
    private int orderAmount;
    private String state = " ";
    private String county = " ";
    private double tax = 0.00;
    private double total = 0.00;

    //getter setters
    public int getOrderAmount() {return orderAmount;}
    public void setOrderAmount(int orderAmount) {this.orderAmount = orderAmount;}
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    public String getCounty() {return county;}
    public void setCounty(String county) {this.county = county;}
    public double getTax() {return tax;}
    public void setTax(double tax) {this.tax = tax;}
    public double getTotal() {return total;}
    public void setTotal(double total) {this.total = total;}

    //main start method
    public void doAllTheThings() {
        gatherInfo();
        checkState();
        calcTax();
        calcTotal();
        printTotal();
    }

    //gets order amount and state
    private void gatherInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        setOrderAmount(sc.nextInt());
        sc.nextLine();
        System.out.print("What state do you live in? ");
        setState(sc.nextLine());
    }

    //if state is Wisconsin ask for county
    private void checkState() {
        switch (getState().toLowerCase(Locale.ROOT)) {
            case "wisconsin", "florida" -> askCounty();
        }
    }

    //asks user for the county and sets it
    private void askCounty() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What county do you live in? ");
        setCounty(sc.nextLine());
    }

    //calc tax by setting tax by state and county
    private void calcTax() {
        calcStateTax();
        calcCountyTax();
    }

    private void calcStateTax() {
        switch (getState().toLowerCase(Locale.ROOT)) {
            case "florida" -> setTax(roundCents(getOrderAmount() * .06));
            case "illinois" -> setTax(roundCents(getOrderAmount() * .08));
            case "wisconsin" -> setTax(roundCents(getOrderAmount() * .05));
        }
    }

    private void calcCountyTax() {
        switch (getCounty().toLowerCase(Locale.ROOT)) {
            case "Eau Claire" -> setTax(getTax() + roundCents((getOrderAmount() * .005)));
            case "Dunn" -> setTax(getTax() + roundCents((getOrderAmount() * .004)));
            case "Seminole" -> setTax(getTax() + roundCents(getOrderAmount() * .01));
        }
    }

    //rounds double to 2 decimals
    private double roundCents(double unroundedCents){
       return Math.round(unroundedCents * 100) / 100.0;
    }

    //adds order amount i.e. subtotal and tax together
    private void calcTotal() {
        setTotal(getOrderAmount() + getTax());
    }

    //prints to user
    private void printTotal() {
        if(getState().toLowerCase(Locale.ROOT).equals("illinois") || getState().toLowerCase(Locale.ROOT).equals("wisconsin")){
            System.out.printf("The tax is $%.2f.%n", getTax());
        }
        System.out.printf("The total is $%.2f.", getTotal());
    }
}
