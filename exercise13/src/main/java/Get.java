import java.util.Scanner;

public class Get {

    public static double principalInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        String stringPrincipal = scanner.next();
        return Double.parseDouble(stringPrincipal);
    }
    public static double interestRateInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the rate? ");
        String stringInterestRateInput = scanner.next();
        return Double.parseDouble(stringInterestRateInput) / 100;
    }
    public static double numYears() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the number of years? ");
        String stringNumYears = scanner.next();
        return Double.parseDouble(stringNumYears);
    }

    public static double compoundPerYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the number of times the interest is compounded per year? ");
        String stringCompoundPerYear = scanner.next();
        return Double.parseDouble(stringCompoundPerYear);

        }
    }
