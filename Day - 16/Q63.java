// Write a program to Find pair with given sum. 

package Summer_Assignment_25113EW009;

import java.util.HashSet;

public class Q63 {

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15, 4, 5 };
        int targetSum = 9;

        findPair(numbers, targetSum);
    }

    public static void findPair(int[] arr, int target) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
            }

            seenNumbers.add(num);
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
