package Uc5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BookingRequestQueue
 * Handles booking requests using FIFO queue.
 *
 * @version 5.0
 */
public class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // Add booking request
    public void addRequest(Reservation reservation) {
        queue.add(reservation);
        System.out.println("Request received from " + reservation.getGuestName());
    }

    // Display queue
    public void showQueue() {

        System.out.println("\nBooking Requests (FIFO Order):");

        for (Reservation r : queue) {
            r.display();
        }
    }
}
