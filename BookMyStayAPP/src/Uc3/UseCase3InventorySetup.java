package Uc3;

/**
 * UseCase3InventorySetup
 *
 * Demonstrates centralized room inventory management
 * using HashMap as a single source of truth.
 *
 * Book My Stay - Hotel Booking Management System
 *
 * @version 3.1
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       Book My Stay Application");
        System.out.println("            Version 3.1");
        System.out.println("=================================");

        // Initialize inventory system
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        // Retrieve availability
        System.out.println("\nChecking availability for Double Room...");
        int available = inventory.getAvailability("Double Room");
        System.out.println("Available Double Rooms: " + available);

        // Update availability
        System.out.println("\nUpdating Double Room availability...");
        inventory.updateAvailability("Double Room", available - 1);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nInventory operations completed successfully.");
    }
}
