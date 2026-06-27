// Write a program to Create salary management system.

package Summer_Assignment_25113EW009;

import java.util.ArrayList;
import java.util.Scanner;

public class Q107 {

    class SalaryRecord {
        private int empId;
        private String name;
        private double basicSalary;
        private double hra;
        private double da;
        private double pf;

        public SalaryRecord(int empId, String name, double basicSalary) {
            this.empId = empId;
            this.name = name;
            this.basicSalary = basicSalary;

            this.hra = basicSalary * 0.15;
            this.da = basicSalary * 0.10;
            this.pf = basicSalary * 0.12;
        }

        public double calculateNetSalary() {
            return (basicSalary + hra + da) - pf;
        }

        public int getEmpId() {
            return empId;
        }

        public void displaySalarySlip() {
            System.out.println("----------------------------------------");
            System.out.println("ID: " + empId + " | Name: " + name);
            System.out.println("Basic Salary : $" + basicSalary);
            System.out.println("HRA (+)      : $" + hra);
            System.out.println("DA (+)       : $" + da);
            System.out.println("PF (-)       : $" + pf);
            System.out.println("Net Salary   : $" + calculateNetSalary());
            System.out.println("----------------------------------------");
        }
    }

    public class SalaryManagementSystem {
        public static void main(String[] args) {
            ArrayList<SalaryRecord> records = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Employee & Generate Salary");
                System.out.println("2. View All Salary Slips");
                System.out.println("3. Search Salary Slip by Employee ID");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Basic Salary: ");
                        double basic = sc.nextDouble();

                        records.add(new SalaryRecord(id, name, basic));
                        System.out.println("Salary details generated successfully!");
                        break;

                    case 2:
                        if (records.isEmpty()) {
                            System.out.println("No salary records found.");
                        } else {
                            System.out.println("\n======= ALL EMPLOYEES PAYROLL =======");
                            for (SalaryRecord r : records) {
                                r.displaySalarySlip();
                            }
                        }
                        break;

                    case 3:
                        if (records.isEmpty()) {
                            System.out.println("No records available to search.");
                            break;
                        }
                        System.out.print("Enter Employee ID to search salary details: ");
                        int searchId = sc.nextInt();
                        boolean found = false;

                        for (SalaryRecord r : records) {
                            if (r.getEmpId() == searchId) {
                                System.out.println("\n--- Salary Slip Found ---");
                                r.displaySalarySlip();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Employee Record Not Found!");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting System... Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select 1-4.");
                }
            } while (choice != 4);

            sc.close();
        }
    }

}
