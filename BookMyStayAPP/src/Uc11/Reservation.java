package Uc11;

public class Reservation {
    private String roomId;
    private String guestName;

    public Reservation(String roomId, String guestName) {
        this.roomId = roomId;
        this.guestName = guestName;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getGuestName() {
        return guestName;
    }
}