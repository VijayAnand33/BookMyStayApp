package Uc6;
import java.util.*;

public class RoomAllocationService {

    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> roomTypeAllocation;
    private InventoryService inventoryService;
    private int roomCounter = 1;

    public RoomAllocationService(InventoryService inventoryService) {

        this.inventoryService = inventoryService;

        allocatedRoomIds = new HashSet<>();
        roomTypeAllocation = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation) {

        String roomType = reservation.getRoomType();

        if (!inventoryService.isAvailable(roomType)) {
            System.out.println("No available rooms for " + roomType);
            return;
        }

        String roomId = roomType.substring(0,1).toUpperCase() + roomCounter++;

        while (allocatedRoomIds.contains(roomId)) {
            roomId = roomType.substring(0,1).toUpperCase() + roomCounter++;
        }

        allocatedRoomIds.add(roomId);

        roomTypeAllocation
                .computeIfAbsent(roomType, k -> new HashSet<>())
                .add(roomId);

        inventoryService.decrementRoom(roomType);

        System.out.println("Reservation Confirmed!");
        System.out.println("Guest: " + reservation.getGuestName());
        System.out.println("Room Type: " + roomType);
        System.out.println("Allocated Room ID: " + roomId);
        System.out.println("---------------------------");
    }

    public void displayAllocations() {

        System.out.println("\nAllocated Rooms:");
        System.out.println(roomTypeAllocation);
    }
}
