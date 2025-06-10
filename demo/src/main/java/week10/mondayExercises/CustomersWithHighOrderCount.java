package week10.mondayExercises;

import java.sql.*;
import java.util.Scanner;

public class CustomersWithHighOrderCount {
    public static void main(String[] args) throws SQLException {
        // 1. connect
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);

        // 2. run query
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT Customers.CustomerID, count(*) AS Ordercount FROM northwind.Customers\n" +
                "JOIN Orders ON Customers.CustomerID = Orders.CustomerID\n" +
                "GROUP BY Customers.CustomerID\n" +
                "HAVING OrderCount > ?;");
        preparedStatement.setInt(1, getUserInput());
        ResultSet resultSet = preparedStatement.executeQuery();

        // 3. process results
        while(resultSet.next()) {
            System.out.println(resultSet.getString("CustomerID") + " - " + resultSet.getInt("OrderCount"));
        }

        // 4. close all resources
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What order limit are you looking for?");
        return scanner.nextInt();
    }
}
