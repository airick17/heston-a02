package baseline;

import java.util.Scanner;

public class Calculator {
    //holds these fields in the object
    private String stateID;
    private int orderAmount;
    private double subtotal;
    private double tax;
    private double total;

    //getter setter methods
    public void setStateID(String stateID) {
        this.stateID = stateID;
    }
    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public void getInputs() {
        //gets and sets the order amount and state
       setOrderAmount(askOrderAmount());
       setStateID(askState());
    }

    private String askState() {
        //ask and gets int for order amount
        //returns int
        return "";
    }

    private int askOrderAmount() {
       //asks and gets an int for order amount
        //returns int
        return 0;
    }

    public void printOutputs() {
        //prints output
    }

}
