import java.util.Scanner;

public class Get {
    public static double getEuros(){
         Scanner scanner = new Scanner(System.in);
         String stringEuros = scanner.next();
        return Double.parseDouble(stringEuros);
    }
    public static double getRate(){
        Scanner scanner = new Scanner(System.in);
        String stringRate = scanner.next();
        return Double.parseDouble(stringRate);
    }
    //calculates conversion to dollars
    public static double getDollars(double amountInEuros, double conversionRate){
        return amountInEuros * conversionRate;
    }
}
