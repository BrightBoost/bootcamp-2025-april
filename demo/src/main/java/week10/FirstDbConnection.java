package week10;

import java.sql.*;
import java.util.Scanner;

public class FirstDbConnection {
    public static void main(String[] args) throws SQLException {
        String userProduct = getUserInput();

        // 1 get a connection
        // needed: db url, username, password
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");

        // 2 run query = create statement and run it
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM products WHERE ProductName LIKE '%" + userProduct + "%'";
        ResultSet rs = statement.executeQuery(query);

        // 3 process results
        while(rs.next()) {
            System.out.println(rs.getString("ProductName") + " - " + rs.getDouble("UnitPrice"));
        }

        connection.close();

    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product are you looking for?");
        return scanner.nextLine();
    }
}
