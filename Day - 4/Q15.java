package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int statusNum = num;
        int digits = 0;
        int sum = 0;

        while (statusNum > 0) {
            statusNum /= 10;
            digits++;
        }

        statusNum = num;

        while (statusNum > 0) {
            int lastDigit = statusNum % 10;
            sum += Math.pow(lastDigit, digits);
            statusNum /= 10;
        }

        return sum == originalNum;
    }
}
