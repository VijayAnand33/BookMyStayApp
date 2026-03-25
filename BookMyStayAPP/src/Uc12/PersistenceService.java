package Uc12;

import java.io.*;

public class PersistenceService {

    private static final String FILE_NAME = "hotel.dat";

    public static void save(HotelSystem system) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(system);
            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving data!");
        }
    }

    public static HotelSystem load() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            System.out.println("Data loaded successfully!");
            return (HotelSystem) ois.readObject();

        } catch (Exception e) {
            System.out.println("No previous data found. Starting fresh...");
            return new HotelSystem();
        }
    }
}