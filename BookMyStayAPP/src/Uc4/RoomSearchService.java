package Uc4;

import java.util.List;

class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void searchAvailableRooms(List<Room> rooms) {

        System.out.println("\nAvailable Rooms:");

        for (Room room : rooms) {

            int available = inventory.getAvailability(room.getRoomType());

            if (available > 0) {   // Defensive check
                room.displayDetails();
                System.out.println("Available Rooms: " + available);
                System.out.println("------------------------");
            }
        }
    }
}