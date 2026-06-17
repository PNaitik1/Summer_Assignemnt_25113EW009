// Write a program to Union of arrays. 

package Summer_Assignment_25113EW009;

import java.util.HashSet;

public class Q66 {

    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5, 7, 9 };
        int[] array2 = { 3, 4, 5, 6, 7, 8 };

        HashSet<Integer> unionSet = new HashSet<>();

        for (int num : array1) {
            unionSet.add(num);
        }

        for (int num : array2) {
            unionSet.add(num);
        }

        System.out.println("Union of the two arrays: " + unionSet);
    }
}
