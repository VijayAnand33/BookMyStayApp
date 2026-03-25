package Uc12;
import java.io.Serializable;

public class Booking implements Serializable {
    private String customerName;
    private int roomNumber;

    public Booking(String customerName, int roomNumber) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customer='" + customerName + '\'' +
                ", room=" + roomNumber +
                '}';
    }
}