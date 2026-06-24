// Write a program to Remove duplicate characters.

package Summer_Assignment_25113EW009;

import java.util.LinkedHashSet;

public class Q96 {

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicateChars(input);

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result);
    }

    public static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
