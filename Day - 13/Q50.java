// Write a program to Find sum and average of array.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println(" Results ");
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
