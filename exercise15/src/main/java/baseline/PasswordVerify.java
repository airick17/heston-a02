package baseline;

import java.util.Scanner;

public class PasswordVerify {
    private String enteredPassword = "";

    //useful getter setters
    public String getEnteredPassword() {return enteredPassword;}
    public void setEnteredPassword(String enteredPassword) {this.enteredPassword = enteredPassword;}

    public void prompt() {
        //ask for password
        //set class entered password trim it
        System.out.print("What is your username? ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.print("What is your password? ");
        setEnteredPassword(scanner.nextLine().trim());
    }

    private boolean comparePasswords() {
        //checks if correct is = to compare
        //true if =
        String correctPassword = "abc$123";
        return (correctPassword.equals(getEnteredPassword()));
    }

    public void printResult() {
        //prints welcome, or I don't know you
        //if else with compare passwords
        if (comparePasswords()){
            System.out.print("Welcome!");
        }else {
            System.out.print("I don't know you.");
        }
    }
}
