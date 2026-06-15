// Write a program to Rotate array right. 

package Summer_Assignment_25113EW009;

import java.util.Arrays;

public class Q59 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int d = 2;

        System.out.println("Original Array: " + Arrays.toString(numbers));

        rotateRight(numbers, d);

        System.out.println("Right Rotated Array by " + d + " positions: " + Arrays.toString(numbers));
    }

    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        for (int i = 0; i < d; i++) {
            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }
    }
}
