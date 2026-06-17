// Write a program to Binary search. 

package Summer_Assignment_25113EW009;

public class Q71 {
    public static void main(String[] args) {
        int[] array = { 11, 12, 22, 25, 34, 64, 90 };
        int target = 25;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element " + target + " is not present in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
