package Uc9;

import java.util.*;

public class BookingService {

    private Map<String, Integer> inventory = new HashMap<>();

    public BookingService() {
        inventory.put("Standard", 2);
        inventory.put("Deluxe", 2);
        inventory.put("Suite", 1);
    }

    public void bookRoom(Reservation reservation) throws InvalidBookingException {

        // Step 1: Validate input
        BookingValidator.validate(reservation);

        String roomType = reservation.getRoomType();

        // Step 2: Check availability
        int available = inventory.getOrDefault(roomType, 0);

        if (available <= 0) {
            throw new InvalidBookingException("No rooms available for " + roomType);
        }

        // Step 3: Update inventory
        inventory.put(roomType, available - 1);

        System.out.println("Booking successful: " + reservation);
    }

    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}