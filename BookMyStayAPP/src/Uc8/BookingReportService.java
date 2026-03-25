package Uc8;

import java.util.*;

public class BookingReportService {

    // Display all bookings
    public void displayAllBookings(List<Reservation> reservations) {
        if (reservations.isEmpty()) {
            System.out.println("No booking history available.");
            return;
        }

        System.out.println("\n--- Booking History ---");
        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }

    // Generate summary report
    public void generateSummary(List<Reservation> reservations) {
        System.out.println("\n--- Booking Summary Report ---");
        System.out.println("Total Bookings: " + reservations.size());

        // Count by room type
        Map<String, Integer> roomCount = new HashMap<>();

        for (Reservation r : reservations) {
            String roomType = r.getRoomType();
            roomCount.put(roomType, roomCount.getOrDefault(roomType, 0) + 1);
        }

        System.out.println("Room Type Distribution:");
        for (Map.Entry<String, Integer> entry : roomCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}