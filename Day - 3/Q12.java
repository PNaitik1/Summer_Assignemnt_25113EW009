// Write a program to Find LCM of two numbers. 

package Summer_Assignment_25113EW009;

public class Q12 {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        int result = findLCM(num1, num2);

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
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
