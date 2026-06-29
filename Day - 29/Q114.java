package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n = 0, choice, i, key;

        do {
            System.out.println("\n===== ARRAY OPERATIONS MENU =====");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Find Maximum");
            System.out.println("5. Find Minimum");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();
                    System.out.println("Enter " + n + " elements:");
                    for (i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.println("Array Elements:");
                        for (i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    key = sc.nextInt();
                    boolean found = false;

                    for (i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int max = arr[0];
                        for (i = 1; i < n; i++) {
                            if (arr[i] > max) {
                                max = arr[i];
                            }
                        }
                        System.out.println("Maximum element = " + max);
                    }
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        int min = arr[0];
                        for (i = 1; i < n; i++) {
                            if (arr[i] < min) {
                                min = arr[i];
                            }
                        }
                        System.out.println("Minimum element = " + min);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
