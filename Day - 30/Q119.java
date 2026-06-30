// Write a program to Create mini employee management system.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q119 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] empId = new int[n];
        String[] empName = new String[n];
        String[] department = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Department: ");
            department[i] = sc.nextLine();

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n----- Employee Records -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Employee ID : " + empId[i]);
            System.out.println("Name        : " + empName[i]);
            System.out.println("Department  : " + department[i]);
            System.out.println("Salary      : " + salary[i]);
            System.out.println("----------------------------");
        }

        sc.close();
    }
}
