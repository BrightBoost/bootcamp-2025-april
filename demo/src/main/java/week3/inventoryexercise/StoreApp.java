package week3.inventoryexercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();

    }

    public static void displayMenu() {
        boolean run = true;
        while(run) {
            String menu = """
What do you want to do?
  1-List all products
  2-Lookup a product by its id
  3-Find all products within a price range 
  4-Add a new product
  5-Quit the application
               """;
            System.out.println(menu);
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    listAllProducts();
                    break;
                case 2:
                    System.out.println("What id?");
                    Product p = findProductById(Integer.parseInt(scanner.nextLine()));
                    displaySingleProduct(p);
                    break;
                case 3:
                    findProductByPriceRange(2.0, 7);
                    break;
                case 4:
                    addNewProduct(null);
                    break;
                case 5:
                    System.out.println("Ok bye.");
                    run = false;
                    break;
                default:
                    System.out.println("Please enter a nr between 1 and 5.");
            }
        }

    }

    public static void listAllProducts() {
        List<Product> inventory = getInventoryFromFile("data/inventory.csv");
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d - %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static void displaySingleProduct(Product p){
        System.out.printf("id: %d - %s - Price: $%.2f%n",
                p.getId(), p.getName(), p.getPrice());
    }

    public static Product findProductById(int id) {
        List<Product> inventory = getInventoryFromFile("data/inventory.csv");
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getId() == id) {
               return inventory.get(i);
            }
        }
        return null;
    }

    public static Product findProductByPriceRange(double start, double end) {
        return null;
    }

    public static void addNewProduct(Product p){

    }

    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(1, "keyboard", 50));
        inventory.add(new Product(2, "mouse", 80));
        inventory.add(new Product(3, "laptop", 1000));
        inventory.add(new Product(4, "monitor", 200));
        inventory.add(new Product(5, "usb hub", 75));
        return inventory;
    }

    public static List<Product> getInventoryFromFile(String filename) {
        List<Product> products = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] arrProduct = line.split("\\|");
                Product product = new Product(Integer.parseInt(arrProduct[0]), arrProduct[1], Float.parseFloat(arrProduct[2]));
                products.add(product);
            }
        } catch (IOException e) {
            System.out.println("Oh noooo: " + e.getMessage());
        }
        return products;
    }
}
