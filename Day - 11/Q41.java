// Write a program to Write function to find sum of two numbers.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q41 {

    public static int findSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int sum = findSum(a, b);

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        scanner.close();
    }
}
