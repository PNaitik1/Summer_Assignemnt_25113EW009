// Write a program to Linear search.

package Summer_Assignment_25113EW009;

public class Q53 {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 45, 67, 8, 99, 23 };
        int targetValue = 99;

        int result = linearSearch(numbers, targetValue);

        if (result != -1) {
            System.out.println("Element " + targetValue + " found at index: " + result);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}
