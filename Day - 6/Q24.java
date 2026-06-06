// Write a program to Find x^n without pow(). 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        long result = 1;
        int exponent = n;

        while (exponent > 0) {
            result = result * x;
            exponent--;
        }

        System.out.println(x + " raised to the power " + n + " is: " + result);

        scanner.close();
    }
}
