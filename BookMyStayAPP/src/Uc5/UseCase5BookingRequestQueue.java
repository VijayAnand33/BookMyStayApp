package Uc5;

/**
 * UseCase5BookingRequestQueue
 *
 * Demonstrates booking request intake
 * using a FIFO Queue.
 *
 * Book My Stay Hotel Booking System
 *
 * @version 5.1
 */

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("        Book My Stay App");
        System.out.println("          Version 5.1");
        System.out.println("==================================");

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Guest booking requests
        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Double Room");
        Reservation r3 = new Reservation("Charlie", "Suite Room");

        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        bookingQueue.showQueue();
    }
}
