// Write a program to Write function for Fibonacci.

package Summer_Assignment_25113EW009;

public class Q47 {

    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;

        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }
}
