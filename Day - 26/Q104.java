// Write a program to Create quiz application. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q104 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "Which data type is used to create a variable that should store text in Java?",
                "How do you insert COMMENTS in Java code?",
                "Which method can be used to find the length of a string in Java?",
                "Which keyword is used to create a class in Java?",
                "How do you start writing a 'main' method in Java?"
        };

        String[][] options = {
                { "A. txt", "B. String", "C. myString", "D. char" },
                { "A. # This is a comment", "B. /* This is a comment", "C. // This is a comment",
                        "D. -- This is a comment" },
                { "A. length()", "B. getSize()", "C. len()", "D. getLength()" },
                { "A. class", "B. className", "C. struct", "D. NewClass" },
                { "A. public void main()", "B. public static void main(String[] args)", "C. void main()",
                        "D. static main(args)" }
        };

        char[] correctAnswers = { 'B', 'C', 'A', 'A', 'B' };

        int score = 0;

        System.out.println("=================================================");
        System.out.println("       WELCOME TO THE CORE JAVA MINI QUIZ        ");
        System.out.println("=================================================");
        System.out.println("Instructions: Type your answer letter (A, B, C, or D).\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            for (String option : options[i]) {
                System.out.println("  " + option);
            }

            char playerAnswer = ' ';
            boolean isValidInput = false;

            while (!isValidInput) {
                System.out.print("Your Answer: ");
                String input = scanner.nextLine().trim().toUpperCase();

                if (!input.isEmpty() && (input.charAt(0) == 'A' || input.charAt(0) == 'B' || input.charAt(0) == 'C'
                        || input.charAt(0) == 'D')) {
                    playerAnswer = input.charAt(0);
                    isValidInput = true;
                } else {
                    System.out.println("Invalid selection! Please enter A, B, C, or D.");
                }
            }

            if (playerAnswer == correctAnswers[i]) {
                System.out.println("✨ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer was: " + correctAnswers[i] + "\n");
            }
        }

        System.out.println("=================================================");
        System.out.println("                QUIZ COMPLETED                   ");
        System.out.println("=================================================");
        System.out.println("Your Final Score: " + score + " out of " + questions.length);

        double percentage = ((double) score / questions.length) * 100;
        System.out.printf("Percentage Performance: %.1f%%\n", percentage);

        if (percentage >= 80) {
            System.out.println("Evaluation: Excellent job! You know your Java basics well.");
        } else if (percentage >= 50) {
            System.out.println("Evaluation: Good effort! A little revision and you'll ace it.");
        } else {
            System.out.println("Evaluation: Keep practicing! Review the foundations and try again.");
        }

        scanner.close();
    }
}
