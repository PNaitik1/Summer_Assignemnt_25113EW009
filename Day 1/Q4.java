package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;
        int originalNum = num;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("The number of digits in " + originalNum + " is: " + count);

        scanner.close();
    }
}
