// Write a program to Create inventory management system.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] productId = new int[100];
        String[] productName = new String[100];
        int[] quantity = new int[100];
        double[] price = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    productId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    productName[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    System.out.print("Enter Price: ");
                    price[count] = sc.nextDouble();

                    count++;
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No products available.");
                    } else {
                        System.out.println("\nID\tName\tQuantity\tPrice");
                        for (int i = 0; i < count; i++) {
                            System.out.println(productId[i] + "\t" +
                                    productName[i] + "\t" +
                                    quantity[i] + "\t\t" +
                                    price[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to search: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (productId[i] == id) {
                            System.out.println("Product Found:");
                            System.out.println("Name: " + productName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (productId[i] == id) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity updated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
