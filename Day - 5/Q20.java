// Write a program to Find largest prime factor. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int largestPrimeFactor = 2;

        while (number % 2 == 0) {
            largestPrimeFactor = 2;
            number = number / 2;
        }
        for (int i = 3; i <= number; i = i + 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number = number / i;
            }
        }

        System.out.println("The largest prime factor of " + originalNumber + " is: " + largestPrimeFactor);

        scanner.close();
    }
}
