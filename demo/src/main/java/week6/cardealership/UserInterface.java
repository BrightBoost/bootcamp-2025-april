package week6.cardealership;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private static Scanner scanner = new Scanner(System.in);

    public UserInterface() {
    }

    private void init() {
        this.dealership = DealershipFileManager.getDealerShip();
    }

    public void display() {
        init();
        boolean keepGoing = true;
        while(keepGoing) {
            displayMenu();
            keepGoing = processUserChoice(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Thank you for using our app! Bye now.");
    }

    public void displayMenu() {
        String menu = """
                1 - Find vehicles within a price range
                2 - Find vehicles by make / model
                3 - Find vehicles by year range
                4 - Find vehicles by color
                5 - Find vehicles by mileage range
                6 - Find vehicles by type (car, truck, SUV, van) 
                7 - List ALL vehicles
                8 - Add a vehicle
                9 - Remove a vehicle
                99 - Quit
                """;
        System.out.println(menu);
    }

    public boolean processUserChoice(int choice) {
        switch(choice) {
            case 1:
                processGetByPriceRequest();
                break;
            case 2:
                processGetByMakeModelRequest();
                break;
            case 3:
                processGetByYearRequest();
                break;
            case 4:
                processGetByColorRequest();
                break;
            case 5:
                processGetByMileageRequest();
                break;
            case 6:
                processGetByTypeRequest();
                break;
            case 7:
                displayVehicles(dealership.getInventory());
                break;
            case 8:
                processAddVehicleRequest();
                break;
            case 9:
                processRemoveVehicleRequest();
                break;
            case 99:
                return false;
            default:
                System.out.println("That's not a valid option");
        }
        return true;
    }

    public void processGetByPriceRequest() {
        System.out.println("What is the min price?");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("What is the max price?");
        double max = Double.parseDouble(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest() {
        System.out.println("What is the make?");
        String make = scanner.nextLine();
        System.out.println("What is the model?");
        String model = scanner.nextLine();
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

    public void processGetByYearRequest() {
        System.out.println("What is the start year?");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the end year?");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByYear(min, max));
    }

    public void processGetByColorRequest() {
        System.out.println("What is the color?");
        String color = scanner.nextLine();
        displayVehicles(dealership.getVehiclesByColor(color));
    }

    public void processGetByMileageRequest() {
        System.out.println("What is the min mileage?");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the max mileage?");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByMileage(min, max));
    }

    public void processGetByTypeRequest() {
        System.out.println("What is the type?");
        String color = scanner.nextLine();
        displayVehicles(dealership.getVehiclesByType(color));
    }

    public void processAddVehicleRequest() {
        System.out.println("Vin:");
        String vin = scanner.nextLine();
        System.out.println("Year:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Make:");
        String make = scanner.nextLine();
        System.out.println("Model:");
        String model = scanner.nextLine();
        System.out.println("Type:");
        String type = scanner.nextLine();
        System.out.println("Color:");
        String color = scanner.nextLine();
        System.out.println("Odometer:");
        int odometer = Integer.parseInt(scanner.nextLine());
        System.out.println("Price:");
        double price = Double.parseDouble(scanner.nextLine());
        Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
        this.dealership.addVehicle(vehicle);

    }

    public void processRemoveVehicleRequest() {
        System.out.println("Vin:");
        String vin = scanner.nextLine();
        Vehicle vehicle = new Vehicle(vin, 0, null, null, null, null, 0, 0);
        this.dealership.removeVehicle(vehicle);
    }

    private void displayVehicles(List<Vehicle> vehicleList) {
        for(Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toFileString());
        }
    }
}
