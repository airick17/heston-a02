package baseline;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class CarTroubleshooter {

    private String userAnswer;

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    private void userInputYOrN() {
        Scanner sc = new Scanner(System.in);
        setUserAnswer(sc.next().trim().toLowerCase(Locale.ROOT));
    }

    private void askNoiseKey() {
        System.out.print("Is the car silent when you turn the key? ");
        userInputYOrN();
    }

    private void askBTCorroded() {
        System.out.print("Are the battery terminals corroded? ");
        userInputYOrN();
    }

    private void askClickingNoise() {
        System.out.print("Does the car make a clicking noise? ");
        userInputYOrN();
    }

    private void askCrankNoStart() {
        System.out.print("Does the car crank up but fail to start? ");
        userInputYOrN();
    }

    private void askStartThanDie() {
        System.out.print("Does the engine start and then die? ");
        userInputYOrN();
    }

    private void askFuelInject() {
        System.out.print("Does you car have fuel injection? ");
        userInputYOrN();
    }

    public void run() {
        askNoiseKey();
        if (Objects.equals(getUserAnswer(), "y")) {
            askBTCorroded();
            if (Objects.equals(getUserAnswer(), "y")){
                System.out.print("Clean terminals and try starting again.");
            }else if(Objects.equals(getUserAnswer(), "n")){
                System.out.print("Replace cables and try again.");
            }
        }else if(Objects.equals(getUserAnswer(), "n")){
            askClickingNoise();
            if (Objects.equals(getUserAnswer(), "y")){
                System.out.print("Replace the battery.");
            }else if(Objects.equals(getUserAnswer(), "n")){
                askCrankNoStart();
                if (Objects.equals(getUserAnswer(), "y")){
                    System.out.print("Check spark plug connections.");
                }else if(Objects.equals(getUserAnswer(), "n")){
                    askStartThanDie();
                    if (Objects.equals(getUserAnswer(), "y")){
                        askFuelInject();
                        if (Objects.equals(getUserAnswer(), "y")){
                            System.out.print("Get it in for service.");
                        }else if(Objects.equals(getUserAnswer(), "n")) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }else if(Objects.equals(getUserAnswer(), "n")){
                        System.out.print("This should not be possible.");
                    }
                }

            }

        }
        System.out.println(" ");
    }
}

