// Write a program to Print factors of a number. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Factors of " + number + " are: ");

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
