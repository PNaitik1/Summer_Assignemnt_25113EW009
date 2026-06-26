// Write a program to Create ATM simulation. 

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q103 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.00;
        int userPin = 1234;
        boolean isRunning = true;

        System.out.println("=== Welcome to the Automated Teller Machine (ATM) ===");

        System.out.print("Please enter your 4-digit PIN: ");
        if (scanner.hasNextInt()) {
            int enteredPin = scanner.nextInt();

            if (enteredPin != userPin) {
                System.out.println("Incorrect PIN. Access Denied.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Access Denied.");
            scanner.close();
            return;
        }

        while (isRunning) {
            System.out.println("\n--- ATM MAIN MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("Your current balance is: $%.2f\n", balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: $");
                        if (scanner.hasNextDouble()) {
                            double depositAmount = scanner.nextDouble();
                            if (depositAmount > 0) {
                                balance += depositAmount;
                                System.out.printf("Successfully deposited $%.2f. New Balance: $%.2f\n", depositAmount,
                                        balance);
                            } else {
                                System.out.println("Invalid amount. Deposit must be greater than 0.");
                            }
                        } else {
                            System.out.println("Invalid input amount.");
                            scanner.next();
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: $");
                        if (scanner.hasNextDouble()) {
                            double withdrawAmount = scanner.nextDouble();
                            if (withdrawAmount <= 0) {
                                System.out.println("Invalid amount. Withdrawal must be greater than 0.");
                            } else if (withdrawAmount > balance) {
                                System.out.println(
                                        "Insufficient funds! Your balance is lower than the requested amount.");
                            } else {
                                balance -= withdrawAmount;
                                System.out.printf("Successfully withdrew $%.2f. New Balance: $%.2f\n", withdrawAmount,
                                        balance);
                            }
                        } else {
                            System.out.println("Invalid input amount.");
                            scanner.next();
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please choose between 1 and 4.");
                }
            } else {
                System.out.println("Invalid selection. Please enter a choice from the menu.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
