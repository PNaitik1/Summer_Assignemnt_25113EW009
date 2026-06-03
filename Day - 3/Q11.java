// Write a program to Find GCD of two numbers.

package Summer_Assignment_25113EW009;

public class Q11 {

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;

        int result = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
