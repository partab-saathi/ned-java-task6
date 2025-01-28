/*Q6. Temperature Category
Input temperature in Celsius and classify it:
Below 0: Freezing
0-20: Cold
21-35: Warm
Above 35: Hot */
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double temperature = sc.nextDouble();

            if (temperature < 0) {
                System.out.println("Freezing");
            } else if (temperature <= 20) {
                System.out.println("Cold");
            } else if (temperature <= 35) {
                System.out.println("Warm");
            } else {
                System.out.println("Hot");
            }
        }
    }
}
