package Uc12;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Inventory implements Serializable {
    private Set<Integer> availableRooms = new HashSet<>();

    public Inventory() {
        for (int i = 1; i <= 5; i++) {
            availableRooms.add(i); // rooms 1-5
        }
    }

    public boolean isAvailable(int room) {
        return availableRooms.contains(room);
    }

    public void bookRoom(int room) {
        availableRooms.remove(room);
    }

    public void releaseRoom(int room) {
        availableRooms.add(room);
    }

    public Set<Integer> getAvailableRooms() {
        return availableRooms;
    }
}