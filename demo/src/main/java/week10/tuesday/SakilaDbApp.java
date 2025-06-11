package week10.tuesday;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SakilaDbApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String query = "SELECT title, first_name, last_name FROM sakila.actor\n" +
                "JOIN film_actor ON film_actor.actor_id = actor.actor_id\n" +
                "JOIN film ON film_actor.film_id = film.film_id\n" +
                "WHERE first_name = ? AND last_name = ?;";

    Actor actor = promptForActor();

        try(
                Connection connection = configureDatasource(args).getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)
                ) {
            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                System.out.println("Films of the author you picked:");
                while(resultSet.next()) {
                    System.out.println(resultSet.getString("title"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static DataSource configureDatasource(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(args[0]);
        dataSource.setPassword(args[1]);
        return dataSource;
    }

    public static Actor promptForActor() {
        Actor actor = new Actor();
        System.out.println("What is the first name of the actor?");
        actor.setFirstName(scanner.nextLine());
        System.out.println("What is the last name of the actor?");
        actor.setLastName(scanner.nextLine());
        return actor;
    }
}
