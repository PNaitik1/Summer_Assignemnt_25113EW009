// Write a program to Write function to find maximum.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q42 {

    public static int findMaximum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int max = findMaximum(a, b);

        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}
