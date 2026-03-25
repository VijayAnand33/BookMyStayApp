package Uc12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Load previous data
        HotelSystem system = PersistenceService.load();

        while (true) {
            System.out.println("\n1. Book Room");
            System.out.println("2. View Bookings");
            System.out.println("3. Save & Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();

                    System.out.print("Enter room number: ");
                    int room = sc.nextInt();

                    system.addBooking(name, room);
                    break;

                case 2:
                    system.showBookings();
                    break;

                case 3:
                    PersistenceService.save(system);
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}