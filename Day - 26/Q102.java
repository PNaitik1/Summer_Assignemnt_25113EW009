// Write a program to Create voting eligibility system.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Voting Eligibility Checker ===");
        System.out.print("Please enter your age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Invalid age! Age cannot be negative.");
            } else if (age >= 18) {
                System.out.println("Congratulations! You are eligible to vote.");
            } else {
                int yearsLeft = 18 - age;
                System.out.println("You are not eligible to vote yet.");
                System.out.println("You need to wait " + yearsLeft + " more year(s) to vote.");
            }
        } else {
            System.out.println("Error: Please enter a valid number for age.");
        }

        scanner.close();
    }
}
