package Uc4;

import java.util.ArrayList;
import java.util.List;

/**
 * UseCase4RoomSearch
 *
 * Demonstrates room search with read-only access
 * to centralized room inventory.
 *
 * Book My Stay Hotel Booking System
 *
 * @version 4.0
 */

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       Book My Stay App");
        System.out.println("           Version 4.0");
        System.out.println("=================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Create room domain objects
        List<Room> rooms = new ArrayList<>();
        rooms.add(new SingleRoom());
        rooms.add(new DoubleRoom());
        rooms.add(new SuiteRoom());

        // Search service
        RoomSearchService searchService = new RoomSearchService(inventory);

        // Guest searches available rooms
        searchService.searchAvailableRooms(rooms);
    }
}
