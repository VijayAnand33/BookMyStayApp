/**
 * Abstract Room class representing common properties
 * shared by all room types.
 */
abstract class Room {

    protected String roomType;
    protected int beds;
    protected double pricePerNight;

    public Room(String roomType, int beds, double pricePerNight) {
        this.roomType = roomType;
        this.beds = beds;
        this.pricePerNight = pricePerNight;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price per night: $" + pricePerNight);
    }
}
