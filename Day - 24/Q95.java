// Write a program to Find longest word. 

package Summer_Assignment_25113EW009;

public class Q95 {

    public static void main(String[] args) {
        String sentence = "Today is a beautiful day to write some elegant Java code.";
        String longest = findLongestWord(sentence);

        System.out.println("Sentence: " + sentence);
        System.out.println("Longest word: " + longest);
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");

            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }

        return longestWord;
    }
}
