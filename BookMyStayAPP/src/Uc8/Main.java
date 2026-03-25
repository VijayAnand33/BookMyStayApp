package Uc8;

public class Main {
    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();
        BookingReportService reportService = new BookingReportService();

        // Simulate confirmed bookings
        history.addReservation(new Reservation("R101", "Vijay", "Deluxe"));
        history.addReservation(new Reservation("R102", "Arun", "Standard"));
        history.addReservation(new Reservation("R103", "Kumar", "Deluxe"));

        // Display history
        reportService.displayAllBookings(history.getAllReservations());

        // Generate report
        reportService.generateSummary(history.getAllReservations());
    }
}