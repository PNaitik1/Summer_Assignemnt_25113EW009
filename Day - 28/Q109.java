// Write a program to Create library management system.

package Summer_Assignment_25113EW009;

import java.util.ArrayList;
import java.util.Scanner;

public class Q109 {
    static class Book {
        int id;
        String name;
        String author;
        boolean issued;

        Book(int id, String name, String author) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.issued = false;
        }

        void display() {
            System.out.println("Book ID : " + id);
            System.out.println("Book Name : " + name);
            System.out.println("Author : " + author);
            System.out.println("Status : " + (issued ? "Issued" : "Available"));
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, name, author));
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No Books Available.");
                    } else {
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.id == searchId) {
                            b.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    boolean issued = false;

                    for (Book b : books) {
                        if (b.id == issueId) {
                            if (!b.issued) {
                                b.issued = true;
                                System.out.println("Book Issued Successfully.");
                            } else {
                                System.out.println("Book Already Issued.");
                            }
                            issued = true;
                            break;
                        }
                    }

                    if (!issued) {
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}