// Write a program to Find string length without strlen().

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q81 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = 0;

        for (char ch : str.toCharArray()) {
            length++;
        }

        System.out.println("The length of the string is: " + length);

        scanner.close();
    }
}
