// Write a program to Recursive Fibonacci. 

package Summer_Assignment_25113EW009;

public class Q26 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);

        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}
