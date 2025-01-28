/*Q2. Leap Year Checker
Accept a year as input and determine whether it is a leap year or not:
A year is a leap year if it is divisible by 4 but not by 100, except if divisible by 400. */
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
