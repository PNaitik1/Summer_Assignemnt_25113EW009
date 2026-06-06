// Write a program to Count set bits in a number. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }

        System.out.println("Number of set bits (1s): " + count);

        scanner.close();
    }
}
