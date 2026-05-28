package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);

        input.close();
    }
}
