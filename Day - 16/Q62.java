// Write a program to Find maximum frequency element.

package Summer_Assignment_25113EW009;

import java.util.HashMap;
import java.util.Map;

public class Q62 {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 2, 3, 4, 3, 5, 2 };

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxElement = numbers[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("The element with maximum frequency is: " + maxElement);
        System.out.println("It appears " + maxCount + " times.");
    }
}
