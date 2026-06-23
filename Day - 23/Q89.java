// Write a program to Find first non-repeating character.

package Summer_Assignment_25113EW009;

public class Q89 {

    public static void main(String[] args) {
        String str = "swiss";

        char result = findFirstNonRepeating(str);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("All characters are repeating or the string is empty.");
        }
    }

    public static char findFirstNonRepeating(String s) {
        int[] charCount = new int[256];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '\0';
    }
}
