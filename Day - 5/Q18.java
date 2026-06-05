// Write a program to Check strong number.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int number = originalNumber;
        int totalSum = 0;

        while (number > 0) {
            int digit = number % 10;

            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            totalSum = totalSum + factorial;
            number = number / 10;
        }

        if (totalSum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is NOT a Strong number.");
        }

        scanner.close();
    }
}
