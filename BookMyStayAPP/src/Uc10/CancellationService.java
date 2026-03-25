package Uc10;

import java.util.*;

public class CancellationService {

    private Stack<String> rollbackStack = new Stack<>();

    public void cancelBooking(String reservationId,
                              BookingService bookingService)
            throws InvalidCancellationException {

        Map<String, Reservation> bookings = bookingService.getActiveBookings();

        // Validate existence
        if (!bookings.containsKey(reservationId)) {
            throw new InvalidCancellationException("Reservation not found.");
        }

        Reservation reservation = bookings.get(reservationId);

        // Push to stack (rollback tracking)
        rollbackStack.push(reservation.getReservationId());

        // Restore inventory
        String roomType = reservation.getRoomType();
        Map<String, Integer> inventory = bookingService.getInventory();

        inventory.put(roomType, inventory.get(roomType) + 1);

        // Remove booking
        bookings.remove(reservationId);

        System.out.println("Cancelled: " + reservation);
    }

    public void displayRollbackStack() {
        System.out.println("\nRollback Stack: " + rollbackStack);
    }
}