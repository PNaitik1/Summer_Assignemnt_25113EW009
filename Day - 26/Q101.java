// Write a program to Create number guessing game.

package Summer_Assignment_25113EW009;

import java.util.Random;
import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (!hasWon) {
            System.out.print("Enter your guess: ");

            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    hasWon = true;
                    System.out.println("\nCongratulations! You've guessed the right number!");
                    System.out.println("It took you " + numberOfTries + " tries.");
                }
            } else {
                System.out.println("That's not a valid number. Please enter a number between 1 and 100.");
                scanner.next();
            }

        }
        scanner.close();
    }
}
