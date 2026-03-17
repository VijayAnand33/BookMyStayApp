package Uc6;

import java.util.LinkedList;
import java.util.Queue;

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      Book My Stay - App");
        System.out.println("      Room Allocation Service");
        System.out.println("=================================");

        Queue<Reservation> requestQueue = new LinkedList<>();

        requestQueue.add(new Reservation("Alice", "Single"));
        requestQueue.add(new Reservation("Bob", "Double"));
        requestQueue.add(new Reservation("Charlie", "Suite"));
        requestQueue.add(new Reservation("David", "Single"));

        InventoryService inventory = new InventoryService();

        RoomAllocationService allocationService =
                new RoomAllocationService(inventory);

        while (!requestQueue.isEmpty()) {

            Reservation request = requestQueue.poll();

            allocationService.allocateRoom(request);
        }

        allocationService.displayAllocations();

        inventory.displayInventory();
    }
}
