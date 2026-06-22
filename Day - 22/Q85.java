// Write a program to Check palindrome string. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q85 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String cleanStr = str.toLowerCase();

        boolean isPalindrome = true;
        int length = cleanStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println('"' + str + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + str + '"' + " is not a palindrome.");
        }

        scanner.close();
    }
}
