/**
 * UseCase2RoomInitialization
 *
 * Demonstrates room object creation using inheritance
 * and static room availability variables.
 *
 * Book My Stay - Hotel Booking Management System
 *
 * @version 2.1
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      Book My Stay Application");
        System.out.println("      Version 2.1");
        System.out.println("=================================");

        // Create room objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("\n--- Room Details ---");

        single.displayRoomDetails();
        System.out.println("Available Rooms: " + singleAvailable);

        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleAvailable);

        System.out.println();

        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteAvailable);

        System.out.println("\nThank you for using Book My Stay!");
    }
}