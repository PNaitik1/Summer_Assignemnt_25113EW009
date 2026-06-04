// Write a program to Generate Fibonacci series. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

        int n, t1 = 0, t2 = 1, next;

        System.out.print("Enter number of terms: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n < 0) {
            System.out.print("Enter a positive number");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(t1 + " ");
                next = t1 + t2;
                t1 = t2;
                t2 = next;
            }
        }
        scanner.close();
    }

}
