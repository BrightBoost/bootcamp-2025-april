package week10.wednesday.language;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LanguageDAO {
    private DataSource dataSource;

    public LanguageDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Language> getAll() {
        // This is the query that I will run on the db later
        String query = "SELECT language_id, name FROM language;";
        // This is the list that I'll filling with all the records (rows) from the db
        List<Language> languages = new ArrayList<>();
        try (
                // making a connection to sakila
                Connection connection = dataSource.getConnection();
                // Getting the query ready to run
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                // run the query and save results in resultset
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                Language language = new Language(resultSet.getInt("language_id"), resultSet.getString("name"));
                languages.add(language);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return languages;
    }

    public Language getLanguageById(int id) {
        String query = "SELECT language_id, name FROM language WHERE language_id = ?;";
        Language language = null;
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ) {
            preparedStatement.setInt(1, id);
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()) {
                    language = new Language(resultSet.getInt("language_id"), resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return language;
    }


    public Language getLanguageByName(String name) {
        String query = "SELECT language_id, name FROM language WHERE name = ?;";
        Language language = null;
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1, name);
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()) {
                    language = new Language(resultSet.getInt("language_id"), resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return language;
    }

    public void add(Language language) {
        String query = "INSERT INTO language (name) VALUES (?);";
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1, language.getName());
            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected != 1) {
                throw new SQLException("Insertion failed! " + language);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(int idOfValueToBeUpdated, Language language) {
        String query = "UPDATE language SET name = ? WHERE language_id = ?;";
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1, language.getName());
            preparedStatement.setInt(2, idOfValueToBeUpdated);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int idOfValueToDeleted) {
        String query = "DELETE FROM language WHERE language_id = ?;";
        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, idOfValueToDeleted);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
