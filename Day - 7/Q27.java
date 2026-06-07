// Write a program to Recursive sum of digits. 

package Summer_Assignment_25113EW009;

public class Q27 {

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        int result = sumOfDigits(num);

        System.out.println("The sum of digits of " + num + " is: " + result);
    }
}
