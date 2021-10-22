package baseline;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    //holds these fields in the object
    private String stateID;
    private int orderAmount;
    private double subtotal = 0;
    private double tax = 0;
    private double total = 0;

    //getter setter methods
    public String getStateID() {
        return stateID;
    }
    public int getOrderAmount() {
        return orderAmount;
    }
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

    //prompts user
    //sets values
    public void getInputs() {
        //gets and sets the order amount and state
        System.out.print("What is the order amount? ");
       setOrderAmount(askOrderAmount());
        System.out.print("What is the state? ");
       setStateID(askState());
    }

    //returns next string
    private String askState() {
        //ask and gets int for order amount
        //returns int
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //returns next int
    private int askOrderAmount() {
       //asks and gets an int for order amount
        //returns int
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //checks if stateID is WI
    private boolean isStateWI(){
        return Objects.equals(getStateID(), "WI");
    }

    //calc tax
    private void calculateTax(){
        //calculate as if it is not WI
        //set tax
        //then if it is WIw
        //calculate WI tax
        //set tax
        double taxTemp = getOrderAmount() *.055;
        if(isStateWI()){
            setTax(taxTemp);
        }
    }

    //calc subtotal
    private void calcSubtotal(){
        double subtotalTemp = getOrderAmount();
        setSubtotal(subtotalTemp);
    }

    private void calcTotal(){
        setTotal(getSubtotal()+getTax());
    }

    //calculates all totals
    public void calculateAll(){
        calcSubtotal();
        calculateTax();
        calcTotal();
    }

    //prints just total for non WI and all 3 values for WI
    public void printOutputs() {
        //prints output
        if (isStateWI()){
            System.out.printf("The subtotal is $%.2f.%n" +
                            "The tax is $%.2f.%n" +
                            "The total is $%.2f.", getSubtotal(),getTax(),getTotal());
        }
        else{
            System.out.printf("The total is $%.2f.", getTotal());
        }
    }

}

