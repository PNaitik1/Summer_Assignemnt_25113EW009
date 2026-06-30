// Write a program to Create student record system using arrays and strings.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] rollNo = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        String[] course = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll No: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Age: ");
            age[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Course: ");
            course[i] = sc.nextLine();
        }

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Roll No : " + rollNo[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Age     : " + age[i]);
            System.out.println("Course  : " + course[i]);
            System.out.println("---------------------------");
        }

        sc.close();
    }
}