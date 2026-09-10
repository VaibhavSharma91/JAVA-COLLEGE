import java.util.Scanner;
import java.util.InputMismatchException;

public class CASESTUDY13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter product price: $");
            double price = scanner.nextDouble();
            if (price <= 0) {
                System.out.println("Error: Invalid product price. Must be greater than zero.");
                return;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            if (quantity <= 0) {
                System.out.println("Error: Invalid quantity. Must be at least 1.");
                return;
            }

            System.out.print("Enter discount percentage (0-100): ");
            double discountPercent = scanner.nextDouble();
            if (discountPercent < 0 || discountPercent > 100) {
                System.out.println("Error: Invalid discount percentage. Must be between 0 and 100.");
                return;
            }

            double grossTotal = price * quantity;
            double discountAmount = grossTotal * (discountPercent / 100);
            double finalBill = grossTotal - discountAmount;

            System.out.printf("Gross Total: $%.2f%n", grossTotal);
            System.out.printf("Discount Applied: -$%.2f%n", discountAmount);
            System.out.printf("Final Bill Amount: $%.2f%n", finalBill);
            System.out.println("-----------------------------------");

            System.out.print("Enter payment amount: $");
            double payment = scanner.nextDouble();

            if (payment < finalBill) {
                double shortfall = finalBill - payment;
                System.out.printf("Error: Payment amount less than the bill. You are short $%.2f.%n", shortfall);
            } else {
                double change = payment - finalBill;
                System.out.printf("Payment Successful! Change returned: $%.2f%n", change);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type. Please enter numerical values only.");
        } finally {
            scanner.close();
        }
    }
}
