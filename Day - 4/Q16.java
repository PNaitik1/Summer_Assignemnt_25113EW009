package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {

        if (num == 0)
            return true;
        if (num < 0)
            return false;

        int originalNum = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }
}
