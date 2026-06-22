// Write a program to Convert lowercase to uppercase.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string in lowercase: ");
        String input = scanner.nextLine();

        String result = input.toUpperCase();

        System.out.println("Uppercase string: " + result);

        scanner.close();
    }
}
