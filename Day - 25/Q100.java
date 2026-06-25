// Write a program to Sort words by length. 

package Summer_Assignment_25113EW009;

import java.util.Arrays;
import java.util.Comparator;

public class Q100 {

    public static void main(String[] args) {
        String[] words = { "Elephant", "Cat", "Banana", "Dog", "Blueberry" };

        System.out.println("Original words: " + Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Sorted by length: " + Arrays.toString(words));
    }
}
