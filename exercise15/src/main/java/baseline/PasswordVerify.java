package baseline;

public class PasswordVerify {
    final private String correctPassword = "abc$123";
    private String enteredPassword = "";

    //useful getter setters
    public String getCorrectPassword() {return correctPassword;}
    public String getEnteredPassword() {return enteredPassword;}
    public void setEnteredPassword(String enteredPassword) {this.enteredPassword = enteredPassword;}

    public void prompt() {
        //ask for password
        //set class entered password trim it
    }

    private boolean comparePasswords() {
        //checks if correct is = to compare
        //true if =
        return true;
    }

    public void printResult() {
        //prints welcome, or I don't know you
        //if else with compare passwords
    }

}
