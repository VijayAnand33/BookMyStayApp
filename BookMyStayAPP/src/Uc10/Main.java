package Uc10;

public class Main {
    public static void main(String[] args) {

        BookingService bookingService = new BookingService();
        CancellationService cancellationService = new CancellationService();

        // Book rooms
        bookingService.bookRoom(new Reservation("R101", "Deluxe"));
        bookingService.bookRoom(new Reservation("R102", "Standard"));

        bookingService.displayInventory();

        try {
            // Cancel valid booking
            cancellationService.cancelBooking("R101", bookingService);

            // Cancel invalid booking
            cancellationService.cancelBooking("R999", bookingService);

        } catch (InvalidCancellationException e) {
            System.out.println("Cancellation Failed: " + e.getMessage());
        }

        bookingService.displayInventory();
        cancellationService.displayRollbackStack();
    }
}