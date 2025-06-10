package week10.mondayExercises;

import java.sql.*;
import java.util.Scanner;

public class CustomerByCompanyName {
    public static void main(String[] args) throws SQLException {
        // 1. connect
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);

        // 2. run query
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM northwind.Customers WHERE CompanyName LIKE ?;");
        preparedStatement.setString(1, "%" + getUserInput() + "%");
        ResultSet resultSet = preparedStatement.executeQuery();

        // 3. process results
        while(resultSet.next()) {
            System.out.println(resultSet.getString("CompanyName"));
        }

        // 4. close all resources
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What company are you looking for?");
        return scanner.nextLine();
    }
}
