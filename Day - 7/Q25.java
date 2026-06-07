// Write a program to Recursive factorial. 

package Summer_Assignment_25113EW009;

public class Q25 {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 7;
        int result = factorial(number);

        System.out.println("The factorial of " + number + " is: " + result);
    }
}
