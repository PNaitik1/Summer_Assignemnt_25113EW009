// Write a program to Create marksheet generation system.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        int s1, s2, s3, s4, s5;
        int total;
        double percentage;
        char grade;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        s1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        s2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        s3 = sc.nextInt();

        System.out.print("Enter Marks in Subject 4: ");
        s4 = sc.nextInt();

        System.out.print("Enter Marks in Subject 5: ");
        s5 = sc.nextInt();

        total = s1 + s2 + s3 + s4 + s5;
        percentage = total / 5.0;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("-------------------------------");
        System.out.println("Subject 1 : " + s1);
        System.out.println("Subject 2 : " + s2);
        System.out.println("Subject 3 : " + s3);
        System.out.println("Subject 4 : " + s4);
        System.out.println("Subject 5 : " + s5);
        System.out.println("-------------------------------");
        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);

        if (grade == 'F')
            System.out.println("Result      : Fail");
        else
            System.out.println("Result      : Pass");

        sc.close();
    }
}
