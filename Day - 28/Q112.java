package Summer_Assignment_25113EW009;

import java.util.Scanner;

public class Q112 {

    static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public void displayContact() {
            System.out.println("\n----- Contact Details -----");
            System.out.println("Name  : " + name);
            System.out.println("Phone : " + phone);
            System.out.println("Email : " + email);
        }

        public void updatePhone(String newPhone) {
            phone = newPhone;
            System.out.println("Phone number updated successfully.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Contact Management System =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(name, phone, email);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. View Contact");
            System.out.println("2. Update Phone Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    contact.displayContact();
                    break;

                case 2:
                    System.out.print("Enter New Phone Number: ");
                    String newPhone = sc.nextLine();
                    contact.updatePhone(newPhone);
                    break;

                case 3:
                    System.out.println("Thank you for using Contact Management System.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
