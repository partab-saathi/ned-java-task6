/*Q1. Vowel or Consonant.
Take a single character input from the user and check whether it is a vowel, consonant, or neither. */
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a single character: ");
            char ch = sc.next().toLowerCase().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else if ((ch >= 'a' && ch <= 'z')) {
                System.out.println(ch + " is a consonant.");
            } else {
                System.out.println(ch + " is neither a vowel nor a consonant.");
            }
        }
    }
}
