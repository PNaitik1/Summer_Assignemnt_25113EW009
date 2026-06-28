package Summer_Assignment_25113EW009;

import java.util.Scanner;

class Ticket {
    private String customerName;
    private int totalSeats;
    private int bookedSeats;

    public Ticket(String customerName, int totalSeats) {
        this.customerName = customerName;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public void bookTicket(int seats) {
        if (seats <= 0) {
            System.out.println("Invalid number of seats.");
        } else if (bookedSeats + seats <= totalSeats) {
            bookedSeats += seats;
            System.out.println(seats + " ticket(s) booked successfully.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }

    public void cancelTicket(int seats) {
        if (seats <= 0) {
            System.out.println("Invalid number of seats.");
        } else if (seats <= bookedSeats) {
            bookedSeats -= seats;
            System.out.println(seats + " ticket(s) cancelled successfully.");
        } else {
            System.out.println("You have not booked that many tickets.");
        }
    }

    public void displayDetails() {
        System.out.println("\n----- Booking Details -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Total Seats   : " + totalSeats);
        System.out.println("Booked Seats  : " + bookedSeats);
        System.out.println("Available     : " + (totalSeats - bookedSeats));
    }
}

public class TicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Ticket Booking System =====");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Seats Available: ");
        int totalSeats = sc.nextInt();

        Ticket ticket = new Ticket(name, totalSeats);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Booking Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int book = sc.nextInt();
                    ticket.bookTicket(book);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();
                    ticket.cancelTicket(cancel);
                    break;

                case 3:
                    ticket.displayDetails();
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
