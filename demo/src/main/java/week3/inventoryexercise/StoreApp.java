package week3.inventoryexercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
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
                    System.out.println("What start price?");
                    double start = Double.parseDouble((scanner.nextLine()));
                    System.out.println("What end price?");
                    double end = Double.parseDouble((scanner.nextLine()));
                    List<Product> products = findProductByPriceRange(start, end);
                    displayListProducts(products);
                    break;
                case 4:
                    Product newProduct = promptForNewProduct();
                    addNewProduct("data/inventory.csv", newProduct);
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

    public static void displayListProducts(List<Product> products){
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.printf("id: %d - %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
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

    public static List<Product> findProductByPriceRange(double start, double end) {
        List<Product> inventory = getInventoryFromFile("data/inventory.csv");
        List<Product> matchingProducts = new ArrayList<>();
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getPrice() > start && inventory.get(i).getPrice() < end) {
                matchingProducts.add(inventory.get(i));
            }
        }
        return matchingProducts;
    }

    public static Product promptForNewProduct() {
        System.out.println("What id does your new product have?");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("What name does your new product have?");
        String name = scanner.nextLine();
        System.out.println("What price does your new product have?");
        float price = Float.parseFloat(scanner.nextLine());
        return new Product(id, name, price);
    }

    public static void addNewProduct(String filename, Product p){
        try(FileWriter fw = new FileWriter(filename, true)) {
            fw.write(p.toFileString() + "\n");
        } catch (IOException e) {
            System.out.println("Oh noooo: " + e.getMessage());
        }
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
