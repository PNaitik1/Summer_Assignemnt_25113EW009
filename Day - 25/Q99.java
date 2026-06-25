// Write a program to Sort names alphabetically.

package Summer_Assignment_25113EW009;

import java.util.Arrays;

public class Q99 {

    public static void main(String[] args) {
        String[] names = { "Zara", "John", "Alice", "Bob", "Mike" };

        System.out.println("Original names: " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("Sorted names:   " + Arrays.toString(names));
    }
}
