package Uc12;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HotelSystem implements Serializable {
    private Inventory inventory;
    private List<Booking> bookings;

    public HotelSystem() {
        inventory = new Inventory();
        bookings = new ArrayList<>();
    }

    public void addBooking(String name, int room) {
        if (inventory.isAvailable(room)) {
            inventory.bookRoom(room);
            bookings.add(new Booking(name, room));
            System.out.println("Booking successful!");
        } else {
            System.out.println("Room not available!");
        }
    }

    public void showBookings() {
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }

    public Inventory getInventory() {
        return inventory;
    }
}