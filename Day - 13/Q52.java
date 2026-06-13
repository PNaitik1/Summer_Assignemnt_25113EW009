// Write a program to Count even and odd elements.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q52 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Even elements: " + evenCount);
        System.out.println("Total Odd elements: " + oddCount);

        scanner.close();
    }
}
