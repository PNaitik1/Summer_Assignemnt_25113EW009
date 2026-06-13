// Write a program to Write function for perfect number.

package Summer_Assignment_25113EW009;

public class Q48 {

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int numberToCheck = 28;

        if (isPerfectNumber(numberToCheck)) {
            System.out.println(numberToCheck + " is a Perfect Number.");
        } else {
            System.out.println(numberToCheck + " is NOT a Perfect Number.");
        }
    }
}
