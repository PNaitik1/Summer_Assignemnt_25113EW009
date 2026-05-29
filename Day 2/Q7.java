// Write a program to Find product of digits. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int product = 1;

        // Handle the case if the user enters 0
        if (number == 0) {
            product = 0;
        }

        while (number > 0) {
            product *= (number % 10);
            number /= 10;
        }

        System.out.println("Product of digits: " + product);
        scanner.close();
    }
}
