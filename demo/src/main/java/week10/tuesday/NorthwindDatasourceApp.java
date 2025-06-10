package week10.tuesday;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class NorthwindDatasourceApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = configureDatasource(args);
        boolean running = true;
        while(running) {
            running = homeScreen(dataSource);
        }
    }

    public static DataSource configureDatasource(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(args[0]);
        dataSource.setPassword(args[1]);
        return dataSource;
    }

    public static boolean homeScreen(DataSource dataSource) {
        System.out.println("What do you want to do?");
        System.out.println("1) Display all products.");
        System.out.println("2) Display all customers.");
        System.out.println("3) Display all categories.");
        System.out.println("0) Exit.");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                displayProducts(dataSource, -1);
                break;
            case "2":
                displayCustomers(dataSource);
                break;
            case "3":
                displayCategories(dataSource);
                System.out.println("What categoryId would you like to see the products of?");
                displayProducts(dataSource, Integer.parseInt(scanner.nextLine()));
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

    public static void displayProducts(DataSource dataSource, int categoryId) {

        // if categoryId is provided it is not equal to -1
        // if categoryId = -1 show all products
        String query = categoryId == -1 ? "SELECT * FROM products;" : "SELECT * FROM products WHERE CategoryId = ?;";
        try (
                Connection connection = dataSource.getConnection();
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

    public static void displayCustomers(DataSource dataSource) {

        try (
                Connection connection = dataSource.getConnection();
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

    public static void displayCategories(DataSource dataSource) {

        try (
                Connection connection = dataSource.getConnection();
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
