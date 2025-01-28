/*Q3. Discount Calculator
Write a program to input the purchase amount and calculate a discount based on the following:
Above $500: 20% discount
$300-$500: 10% discount
Below $300: No discount. */
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter purchase amount: $");
            double amount = sc.nextDouble();
            double discount = 0;

            if (amount > 500) {
                discount = amount * 0.20;
            } else if (amount >= 300 && amount <= 500) {
                discount = amount * 0.10;
            }

            System.out.println("Discount: $" + discount);
            System.out.println("Total amount after discount: $" + (amount - discount));
        }
    }
}
