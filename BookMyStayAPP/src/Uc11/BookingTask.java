package Uc11;

public class BookingTask implements Runnable {

    private BookingService service;
    private Reservation reservation;

    public BookingTask(BookingService service, Reservation reservation) {
        this.service = service;
        this.reservation = reservation;
    }

    @Override
    public void run() {
        service.bookRoom(reservation);
    }
}