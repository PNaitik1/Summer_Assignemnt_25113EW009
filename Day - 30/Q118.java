// Write a program to Create mini library system.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bookName = new String[5];
        String[] author = new String[5];

        System.out.println("Enter details of 5 books:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nBook " + (i + 1));

            System.out.print("Book Name: ");
            bookName[i] = sc.nextLine();

            System.out.print("Author Name: ");
            author[i] = sc.nextLine();
        }

        System.out.println("\n----- Library Books -----");

        for (int i = 0; i < 5; i++) {
            System.out.println("Book " + (i + 1));
            System.out.println("Book Name : " + bookName[i]);
            System.out.println("Author    : " + author[i]);
            System.out.println("-------------------------");
        }

        sc.close();
    }
}
