// Write a program to Create employee management system.

package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q106 {

    class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("Employee ID : " + id);
            System.out.println("Employee Name : " + name);
            System.out.println("Employee Salary : " + salary);
            System.out.println("---------------------------");
        }
    }

    public class EmployeeManagementSystem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Employee[] emp = new Employee[10];
            int count = 0;
            int choice;

            do {
                System.out.println("\n===== Employee Management System =====");
                System.out.println("1. Add Employee");
                System.out.println("2. Display Employees");
                System.out.println("3. Search Employee");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (count >= emp.length) {
                            System.out.println("Error: Database full! Cannot add more employees.");
                            break;
                        }

                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();

                        emp[count] = new Employee(id, name, salary);
                        count++;
                        System.out.println("Employee Added Successfully!");
                        break;

                    case 2:
                        if (count == 0) {
                            System.out.println("No employees found.");
                        } else {
                            System.out.println("\n--- Employee List ---");
                            for (int i = 0; i < count; i++) {
                                emp[i].display();
                            }
                        }
                        break;

                    case 3:
                        if (count == 0) {
                            System.out.println("No employees in records to search.");
                            break;
                        }
                        System.out.print("Enter Employee ID to Search: ");
                        int searchId = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < count; i++) {
                            if (emp[i].id == searchId) {
                                System.out.println("\nRecord Found:");
                                emp[i].display();
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee Not Found!");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting Program...");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 4);

            sc.close();
        }
    }
}
