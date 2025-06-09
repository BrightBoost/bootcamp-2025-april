package week10;

import java.sql.*;

public class RandomExample {
    public static void main(String[] args) throws SQLException {
        // check if args has 2 params
        if(args.length != 2) {
            System.out.println("I need two params to do all this.");
            System.out.println("Get me that.");
            System.out.println("Bye.");
        }

        // set username and password
        String username = args[0];
        String password = args[1];


        // 1 get connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);

        // 2 run query
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM northwind.Territories\n" +
                "JOIN Region ON Region.RegionId = Territories.RegionID\n" +
                "WHERE RegionDescription LIKE ?;");
        preparedStatement.setString(1, "%" + "Eastern" + "%");
        ResultSet resultSet = preparedStatement.executeQuery();

        // 3 process results
        while(resultSet.next()) {
            System.out.println(resultSet.getString("TerritoryDescription") + " - " + resultSet.getString("RegionDescription"));
        }


        // close stuff
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
