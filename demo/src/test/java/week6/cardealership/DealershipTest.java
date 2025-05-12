package week6.cardealership;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {
    private Dealership dealership;
    private Vehicle vehicle1;
    private Vehicle vehicle2;
    private Vehicle vehicle3;

    @BeforeEach
    void setUp() {
        dealership = new Dealership("Test ds", "123 street", "123123123");
        vehicle1 = new Vehicle("123", 2025, "audi", "r6", "hatchback", "grey", 0, 300001);
        vehicle2 = new Vehicle("234", 2022, "volkswagen", "troc", "suv", "white", 20000, 20000);
        vehicle3 = new Vehicle("345", 1996, "toyota", "camry", "sedan", "red", 200000, 500);
        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);
        dealership.addVehicle(vehicle3);
        DealershipFileManager.fileLocation = "src/test/resources/inventory.csv";
    }

    @Test
    void addVehicle() {
        // arrange
        Vehicle newVehicle = new Vehicle("456", 2020, "mazda", "3", "sedan", "white", 40000, 20000);

        // act
        dealership.addVehicle(newVehicle);

        // assert
        assertTrue(dealership.getInventory().contains(newVehicle));
    }

    @Test
    void removeVehicle() {

        // act
        dealership.removeVehicle(vehicle1);

        // assert
        assertFalse(dealership.getInventory().contains(vehicle1));
    }

    @Test
    void toFileString() {
        // arrange
        String expectedFileString = "123|2025|audi|r6|hatchback|grey|0|300001.0";

        // act
        String actualFileString = vehicle1.toFileString();

        //assert
        assertEquals(expectedFileString, actualFileString);
    }

    @Test
    void getVehiclesByPrice() {
        // arrange
        int expectedListSize = 1;

        // act
        List<Vehicle> vehicleList = dealership.getVehiclesByPrice(0, 2000);

        // assert
        assertEquals(expectedListSize, vehicleList.size());
        assertTrue(vehicleList.contains(vehicle3));
    }

    @Test
    void getVehiclesByMakeModel() {
    }

    @Test
    void getVehiclesByYear() {
    }

    @Test
    void getVehiclesByColor() {
    }

    @Test
    void getVehiclesByMileage() {
    }

    @Test
    void getVehiclesByType() {
    }

    @Test
    void getAllVehicles() {
    }


}