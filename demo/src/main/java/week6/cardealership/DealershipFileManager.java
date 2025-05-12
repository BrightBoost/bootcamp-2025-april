package week6.cardealership;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DealershipFileManager {

    private static String fileLocation = "src/main/resources/inventory.csv";

    public static Dealership getDealerShip() {
        Dealership dealership = null;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation))) {
            String[] dealershipString = bufferedReader.readLine().split("\\|");
             dealership = new Dealership(dealershipString[0], dealershipString[1], dealershipString[2]);
             String line;
             while((line = bufferedReader.readLine()) != null) {
                 String[] vehicleString = line.split("\\|");
                 Vehicle vehicle = new Vehicle(vehicleString[0], Integer.parseInt(vehicleString[1]), vehicleString[2], vehicleString[3], vehicleString[4], vehicleString[5], Integer.parseInt(vehicleString[6]), Double.parseDouble(vehicleString[7]));
                 dealership.getInventory().add(vehicle);
             }

        } catch(IOException e) {
            e.printStackTrace();
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership) {
        try(FileWriter fileWriter = new FileWriter(fileLocation)) {
            fileWriter.write(dealership.toFileString());
            for(Vehicle vehicle : dealership.getInventory()) {
                fileWriter.write("\n" + vehicle.toFileString());
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
