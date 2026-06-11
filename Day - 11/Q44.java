// Write a program to Write function to find factorial.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q44 {

    public static long findFactorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        long factorial = findFactorial(number);

        if (factorial != -1) {
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
