// Write a program to Remove duplicates from array.

package Summer_Assignment_25113EW009;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q64 {

    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 2, 3, 4, 4, 5 };

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(numbers));

        System.out.println("Array after removing duplicates: " + uniqueSet);
    }
}
