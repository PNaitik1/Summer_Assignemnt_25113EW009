// Write a program to Find common characters in strings.

package Summer_Assignment_25113EW009;

import java.util.ArrayList;
import java.util.List;

public class Q98 {

    public static void main(String[] args) {
        String[] words = { "bella", "label", "roller" };

        List<String> commonChars = findCommonCharacters(words);

        System.out.println("Common characters: " + commonChars);
    }

    public static List<String> findCommonCharacters(String[] words) {
        List<String> result = new ArrayList<>();

        if (words == null || words.length == 0) {
            return result;
        }

        int[] minCounts = new int[26];

        for (char ch : words[0].toCharArray()) {
            minCounts[ch - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] currentCounts = new int[26];

            for (char ch : words[i].toCharArray()) {
                currentCounts[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                minCounts[j] = Math.min(minCounts[j], currentCounts[j]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (minCounts[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minCounts[i]--;
            }
        }

        return result;
    }
}
