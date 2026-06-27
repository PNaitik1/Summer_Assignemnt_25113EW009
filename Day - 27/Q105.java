// Write a program to Create student record management system.

package Summer_Assignment_25113EW009;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private int age;
    private String course;

    public Student(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Course: " + course);
    }
}

public class Q105 {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== STUDENT RECORD MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        studentList.add(new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            s.displayStudent();
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();
        boolean found = false;

        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                System.out.println("\nRecord Found:");
                s.displayStudent();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        Student toRemove = null;

        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            studentList.remove(toRemove);
            System.out.println("Student record deleted successfully!");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}