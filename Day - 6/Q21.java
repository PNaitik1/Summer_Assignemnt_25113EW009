// Write a program to Convert decimal to binary. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = "";

        if (decimal == 0) {
            binary = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary = remainder + binary;
                decimal = decimal / 2;
            }
        }
        System.out.println("Binary equivalent: " + binary);

        scanner.close();
    }
}
