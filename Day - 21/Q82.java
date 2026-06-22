// Write a program to Reverse a string. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q82 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
