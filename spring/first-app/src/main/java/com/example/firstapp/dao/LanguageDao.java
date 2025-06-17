package com.example.firstapp.dao;

import com.example.firstapp.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class LanguageDao {
    private DataSource dataSource;

    @Autowired
    public LanguageDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Language> getAllLanguages() {
        String query = "SELECT * FROM language";
        List<Language> languages = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            while(resultSet.next()) {
                Language language = new Language(resultSet.getInt("language_id"), resultSet.getString("name"));
                languages.add(language);
            }
        } catch(SQLException e) {
            System.out.println("Oh dear: " + e.getMessage());
        }
        return languages;
    }

    public Language getLanguageById(int id) {
        String query = "SELECT * FROM language WHERE language_id = ?";
        Language language = null;
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, id);
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    language = new Language(resultSet.getInt("language_id"), resultSet.getString("name"));
                }
            }
        } catch(SQLException e) {
            System.out.println("Oh dear: " + e.getMessage());
        }
        return language;
    }

    public Language addLanguage(Language language) {
        String query = "INSERT INTO language(name) VALUES (?)";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ) {

            preparedStatement.setString(1, language.getName());

            preparedStatement.executeUpdate();
            try(ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                resultSet.next();
                language.setLanguageId(resultSet.getInt(1));
            }
        } catch(SQLException e) {
            System.out.println("Oh dear: " + e.getMessage());
        }
        return language;
    }

    public boolean updateLanguage(int id, Language language) {
        String query = "UPDATE language SET name = ? WHERE language_id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, language.getName());
            preparedStatement.setInt(2, id);

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            System.out.println("Oh dear (update): " + e.getMessage());
            return false;
        }
    }

    public boolean deleteLanguage(int id) {
        String query = "DELETE FROM language WHERE language_id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            System.out.println("Oh dear (delete): " + e.getMessage());
            return false;
        }
    }






}
