package Uc11;

public class Main {
    public static void main(String[] args) {

        BookingService service = new BookingService();

        Reservation r1 = new Reservation("R101", "Vijay");
        Reservation r2 = new Reservation("R101", "Arun");
        Reservation r3 = new Reservation("R102", "Kumar");

        Thread t1 = new Thread(new BookingTask(service, r1), "Thread-1");
        Thread t2 = new Thread(new BookingTask(service, r2), "Thread-2");
        Thread t3 = new Thread(new BookingTask(service, r3), "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        service.displayRooms();
    }
}
