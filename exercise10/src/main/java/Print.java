public class Print {
    public Print(double subtotal, double tax, double total) {
        System.out.printf("Subtotal: $%.2f", subtotal);
        System.out.printf("\nTax: $%.2f", tax);
        System.out.printf("\nTotal: $%.2f", total);
    }
}
