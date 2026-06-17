// Write a program to Intersection of arrays. 

package Summer_Assignment_25113EW009;

import java.util.HashSet;

public class Q67 {

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 4, 5, 6 };
        int[] array2 = { 2, 3, 5, 7 };

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int num : array1) {
            set.add(num);
        }

        for (int num : array2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        System.out.println("Intersection of the two arrays: " + intersectionSet);
    }
}
