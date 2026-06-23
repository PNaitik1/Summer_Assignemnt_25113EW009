// Write a program to Find maximum occurring character.

package Summer_Assignment_25113EW009;

public class Q92 {

    public static void main(String[] args) {
        String str = "test string";

        char maxChar = findMaxOccurringChar(str);

        System.out.println("The maximum occurring character is: '" + maxChar + "'");
    }

    public static char findMaxOccurringChar(String s) {
        int[] charCount = new int[256];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ')
                continue;

            if (max < charCount[ch]) {
                max = charCount[ch];
                result = ch;
            }
        }

        return result;
    }
}
