package Uc10;

import java.util.*;

public class BookingService {

    private Map<String, Integer> inventory = new HashMap<>();
    private Map<String, Reservation> activeBookings = new HashMap<>();

    public BookingService() {
        inventory.put("Standard", 2);
        inventory.put("Deluxe", 2);
        inventory.put("Suite", 1);
    }

    public void bookRoom(Reservation reservation) {
        String roomType = reservation.getRoomType();

        int available = inventory.getOrDefault(roomType, 0);

        if (available <= 0) {
            System.out.println("No rooms available for " + roomType);
            return;
        }

        inventory.put(roomType, available - 1);
        activeBookings.put(reservation.getReservationId(), reservation);

        System.out.println("Booked: " + reservation);
    }

    public Map<String, Reservation> getActiveBookings() {
        return activeBookings;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public void displayInventory() {
        System.out.println("\nInventory:");
        for (var entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
