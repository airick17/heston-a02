public class Calculate {
    public static void calculate (double principal, double interestRate, double compoundPerYear, double numYears) {
        double amountFinal = principal * Math.pow(1+(interestRate/compoundPerYear), (compoundPerYear*numYears));
        System.out.printf("$%.2f invested at %.2f%% for%2.0f years compounded %.0f times per year is $%.2f. ",principal,interestRate*100,numYears,compoundPerYear,Math.ceil(amountFinal*100.0)/100.0);
    }
}
