package week10;

import java.sql.*;

public class AnotherExample {
    public static void main(String[] args) throws SQLException {
        if(args.length != 2) {
            System.out.println("I need 2 params: username and password.");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        // 1 connect: url, username, password
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);

        // 2 query: sql + execute
        int minShipperId = 5;
        String phoneSnippet = "555";
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM northwind.Shippers WHERE ShipperId > ? OR Phone LIKE ?;");
        preparedStatement.setInt(1, minShipperId);
        preparedStatement.setString(2,"%" + phoneSnippet + "%");
        ResultSet resultSet = preparedStatement.executeQuery();

        // 3 result: step into data, loop + process (or if it's single object dont loop)
        while(resultSet.next()) {
            System.out.println("Id: " + resultSet.getString("ShipperId"));
            System.out.println("Phone: " + resultSet.getString("CompanyName"));
            System.out.println("Name: " + resultSet.getString("Phone"));
            System.out.println("*****************");
        }

    }
}
