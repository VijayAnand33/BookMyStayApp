package Uc9;

public class Main {
    public static void main(String[] args) {

        BookingService service = new BookingService();

        try {
            // Valid booking
            Reservation r1 = new Reservation("R101", "Vijay", "Deluxe");
            service.bookRoom(r1);

            // Invalid room type
            Reservation r2 = new Reservation("R102", "Arun", "Luxury");
            service.bookRoom(r2);

        } catch (InvalidBookingException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }

        service.displayInventory();
    }
}
