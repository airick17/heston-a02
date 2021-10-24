package baseline;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class TempConverter {

    //choice holds c or f
    //input temp is the int that is to be converted
    //tempName is a string for C or F
    private String choice;
    private int inputTemp;
    private String tempName = "not found";

    Scanner scanner = new Scanner(System.in);
    //getter setters
    public String getChoice() {return choice;}
    public void setChoice(String choice) {this.choice = choice;}
    public int getInputTemp() {return inputTemp;}
    public void setInputTemp(int inputTemp) {this.inputTemp = inputTemp;}
    public String getTempName() {return tempName;}
    public void setTempName(String tempName) {this.tempName = tempName;}

    //instructions for user
    public void printInstructions() {
    System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                       "Press F to convert from Celsius to Fahrenheit. ");
    }

    //asks user C or F and sets choice variable
    public void askChoice() {
        tempNameSet();
        System.out.print("Your choice: ");
        setChoice(scanner.nextLine().trim().toLowerCase(Locale.ROOT));

    }

    //asks for temp and sets int class variable to it
    //uses tempNameSet method to set class variable
    //then makes a new string that is opposite of the class variable
    //this string is used to prompt the user appropriately
    public void askTemp() {
        tempNameSet();
        //temp string reversal
        String tempNameReverse = "";
        if(Objects.equals(getTempName(), "Fahrenheit")){
            tempNameReverse = "Celsius";
        }else if(Objects.equals(getTempName(), "Celsius"))
            tempNameReverse = "Fahrenheit";
        //prompt
        System.out.printf("Please enter the temperature in %s: ",tempNameReverse);
        setInputTemp(scanner.nextInt());
    }

    //prints final temp after conversion
    //gets correct temp name from class variable
    public void printResults() {
        tempNameSet();
        int finalTemp = tempCalc();
        System.out.printf("The temperature in %s is %d.", getTempName(), finalTemp);
    }

    //if choice is c it makes tempName = Celsius
    //if choice is f it makes temp name = Fahrenheit
    private void tempNameSet(){
        if(Objects.equals(getChoice(), "c")){
            setTempName("Celsius");

        }else if(Objects.equals(getChoice(), "f")){
            setTempName("Fahrenheit");
        }
    }

    //actual math to convert temp
    private int tempCalc() {
        //f to c
        if(Objects.equals(getChoice(), "c")){
            int f = getInputTemp();
            return (f - 32) * 5 /9;
        //c to f
        }else if(Objects.equals(getChoice(), "f")){
            int c = getInputTemp();
            return (c * 9 / 5) + 32;
        }
        return 0;
    }
}
