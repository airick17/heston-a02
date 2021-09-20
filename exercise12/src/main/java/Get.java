import java.util.Scanner;

public class Get {

    public static double principalInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String stringPrincipal = scanner.next();
        return Double.parseDouble(stringPrincipal);
    }
    protected static double interestRateInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rate of interest: ");
        String stringInterestRateInput = scanner.next();
        return Double.parseDouble(stringInterestRateInput) / 100;
    }
    protected static double numYears() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        String stringNumYears = scanner.next();
        return Double.parseDouble(stringNumYears);
    }

}
