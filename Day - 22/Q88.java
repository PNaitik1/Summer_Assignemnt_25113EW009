// Write a program to Remove spaces from string.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q88 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        String result = input.replaceAll("\\s", "");

        System.out.println("String without spaces: " + result);

        scanner.close();
    }
}
