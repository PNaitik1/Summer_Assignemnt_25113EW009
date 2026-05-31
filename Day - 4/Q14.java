// Write a program to Find nth Fibonacci term. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int result = findNthFibonacci(n);
        System.out.println("The " + n + "-th Fibonacci number is: " + result);

        scanner.close();
    }

    public static int findNthFibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        int first = 0;
        int second = 1;
        int nth = 0;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }

        return nth;
    }
}