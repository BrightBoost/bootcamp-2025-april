package week10.tuesday;

import java.sql.*;
import java.util.Scanner;

public class NorthwindApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        boolean running = true;
        while(running) {
            running = homeScreen(args);
        }
    }

    public static boolean homeScreen(String[] args) {
        System.out.println("What do you want to do?");
        System.out.println("1) Display all products.");
        System.out.println("2) Display all customers.");
        System.out.println("3) Display all categories.");
        System.out.println("0) Exit.");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                displayProducts(args, -1);
                break;
            case "2":
                displayCustomers(args);
                break;
            case "3":
                displayCategories(args);
                System.out.println("What categoryId would you like to see the products of?");
                displayProducts(args, Integer.parseInt(scanner.nextLine()));
                break;
            case "0":
                System.out.println("bye.");
                return false;
            default:
                System.out.println("I don't know that option.");
                break;
        }

        return true;
    }

    public static void displayProducts(String[] args, int categoryId) {

        // if categoryId is provided it is not equal to -1
        // if categoryId = -1 show all products
        String query = categoryId == -1 ? "SELECT * FROM products;" : "SELECT * FROM products WHERE CategoryId = ?;";
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
                PreparedStatement ps = connection.prepareStatement(query);
        ) {
            if(categoryId != -1) {
                ps.setInt(1, categoryId);
            }
            try (
                    ResultSet rs = ps.executeQuery();
            ) {
                while (rs.next()) {
                    System.out.println(rs.getString("ProductName") + " - " + rs.getDouble("UnitPrice") + " - " + rs.getInt("CategoryId"));
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayCustomers(String[] args) {

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
                PreparedStatement ps = connection.prepareStatement("SELECT * FROM customers ORDER BY country;");
        ) {
            try (
                    ResultSet rs = ps.executeQuery();
            ) {
                while (rs.next()) {
                    System.out.println(rs.getString("ContactName") + " - " + rs.getString("CompanyName") + " - " + rs.getString("City") + " - " + rs.getString("country") + " - " + rs.getString("Phone") );
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayCategories(String[] args) {

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
                PreparedStatement ps = connection.prepareStatement("SELECT * FROM categories;");
        ) {
            try (
                    ResultSet rs = ps.executeQuery();
            ) {
                while (rs.next()) {
                    System.out.println(rs.getInt("CategoryId") + " - " + rs.getString("CategoryName"));
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
