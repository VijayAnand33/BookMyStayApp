package Uc11;

import java.util.HashMap;
import java.util.Map;

public class BookingService {

    private Map<String, Boolean> rooms = new HashMap<>();

    public BookingService() {
        rooms.put("R101", true);
        rooms.put("R102", true);
        rooms.put("R103", true);
    }

    // Thread-safe method
    public synchronized void bookRoom(Reservation reservation) {
        String roomId = reservation.getRoomId();

        if (rooms.containsKey(roomId) && rooms.get(roomId)) {
            System.out.println(Thread.currentThread().getName() +
                    " booked room " + roomId +
                    " for " + reservation.getGuestName());

            rooms.put(roomId, false);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " FAILED to book room " + roomId +
                    " for " + reservation.getGuestName());
        }
    }

    public void displayRooms() {
        System.out.println("\nFinal Room Status:");
        for (Map.Entry<String, Boolean> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + " -> " +
                    (entry.getValue() ? "Available" : "Booked"));
        }
    }
}
