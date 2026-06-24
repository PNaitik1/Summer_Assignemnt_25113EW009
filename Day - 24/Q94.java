// Write a program to Compress a string. 

package Summer_Assignment_25113EW009;

public class Q94 {

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compress(input);

        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }

    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);

                countConsecutive = 0;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
