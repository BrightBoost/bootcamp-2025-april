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
        String query = "SELECT language_id, name FROM language;";
        List<Language> languages = new ArrayList<>();
        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
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
}
