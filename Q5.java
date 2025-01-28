/*
Q5. Odd-Even and Divisibility Check
Input a number and check:
If it's even or odd.
If it's divisible by both 3 and 5. */
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " is divisible by both 3 and 5.");
            } else {
                System.out.println(number + " is not divisible by both 3 and 5.");
            }
        }
    }
}
