// Write a program to Check perfect number. 
package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is NOT a Perfect number.");
        }

        scanner.close();
    }
}
