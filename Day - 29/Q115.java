// Write a program to Create menu-driven string operations system.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        do {
            System.out.println("\n===== STRING OPERATIONS MENU =====");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 4:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                    }
                    System.out.println("Reversed String = " + rev);
                    break;

                case 5:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }

                    if (str.equalsIgnoreCase(reverse)) {
                        System.out.println("The string is a Palindrome.");
                    } else {
                        System.out.println("The string is Not a Palindrome.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
