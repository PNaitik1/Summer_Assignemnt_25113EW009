// Write a program to Find first repeating character.

package Summer_Assignment_25113EW009;

import java.util.HashSet;

public class Q90 {

    public static void main(String[] args) {
        String str = "swiss";

        char result = findFirstRepeating(str);

        if (result != '\0') {
            System.out.println("The first repeating character is: " + result);
        } else {
            System.out.println("No repeating characters found.");
        }
    }

    public static char findFirstRepeating(String s) {
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (seen.contains(ch)) {
                return ch;
            }

            seen.add(ch);
        }

        return '\0';
    }
}
