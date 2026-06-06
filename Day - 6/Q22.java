// Write a program to Convert binary to decimal. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = scanner.nextLong();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            long lastDigit = binary % 10;

            decimal += lastDigit * Math.pow(2, power);

            power++;
            binary = binary / 10;
        }
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }
}
