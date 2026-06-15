// Write a program to Reverse array. 

package Summer_Assignment_25113EW009;

import java.util.Arrays;

public class Q57 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Original Array: " + Arrays.toString(numbers));

        reverse(numbers);

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
