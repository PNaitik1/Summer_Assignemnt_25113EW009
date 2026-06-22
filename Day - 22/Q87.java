package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q87 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            int count = 1;

            for (int i = 0; i < sentence.length() - 1; i++) {
                if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                    count++;
                }
            }

            System.out.println("Word count: " + count);
        }

        scanner.close();
    }
}
