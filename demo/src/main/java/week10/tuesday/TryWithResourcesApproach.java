package week10.tuesday;

import java.sql.*;

public class TryWithResourcesApproach {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("I need 2 params: username and password.");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];
        int minShipperId = 5;
        String phoneSnippet = "555";

        try(
                // 1 connect: url, username, password
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);
                // 2 query: sql + execute
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM northwind.Shippers WHERE ShipperId > ? OR Phone LIKE ?;")
        ) {
            preparedStatement.setInt(1, minShipperId);
            preparedStatement.setString(2,"%" + phoneSnippet + "%");
            // 3 result: step into data, loop + process (or if it's single object dont loop)
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                while(resultSet.next()) {
                    System.out.println("Id: " + resultSet.getString("ShipperId"));
                    System.out.println("Phone: " + resultSet.getString("CompanyName"));
                    System.out.println("Name: " + resultSet.getString("Phone"));
                    System.out.println("*****************");
                }
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
