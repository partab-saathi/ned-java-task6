/*
Q4. Traffic Light Simulation
Ask the user to input a color (Red, Yellow, or Green) and display the corresponding traffic signal message:
Red: Stop
Yellow: Get Ready
Green: Go */
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the color (Red, Yellow, Green): ");
            String color = sc.next().toLowerCase();

            if (color.equals("red")) {
                System.out.println("Stop");
            } else if (color.equals("yellow")) {
                System.out.println("Get Ready");
            } else if (color.equals("green")) {
                System.out.println("Go");
            } else {
                System.out.println("Invalid color");
            }
        }
    }
}
