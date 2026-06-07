// Write a program to Recursive reverse number. 

package Summer_Assignment_25113EW009;

public class Q28 {

    public static int reverse(int number, int reversedResult) {
        if (number == 0) {
            return reversedResult;
        }

        reversedResult = (reversedResult * 10) + (number % 10);

        return reverse(number / 10, reversedResult);
    }

    public static int reverse(int number) {
        return reverse(number, 0);
    }

    public static void main(String[] args) {
        int num = 54321;
        int result = reverse(num);

        System.out.println("The reverse of " + num + " is: " + result);
    }
}
