// Write a program to Rotate array left. 

package Summer_Assignment_25113EW009;

import java.util.Arrays;

public class Q58 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int d = 2;

        System.out.println("Original Array: " + Arrays.toString(numbers));

        rotateLeft(numbers, d);

        System.out.println("Left Rotated Array by " + d + " positions: " + Arrays.toString(numbers));
    }

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        for (int i = 0; i < d; i++) {
            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }
    }
}
