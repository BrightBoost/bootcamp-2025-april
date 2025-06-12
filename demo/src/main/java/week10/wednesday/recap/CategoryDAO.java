package week10.wednesday.recap;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {

    private DataSource dataSource;

    public CategoryDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        String query = "SELECT * FROM category";

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
            ) {

            while(resultSet.next()) {
                categories.add(new Category( resultSet.getInt( "category_id"), resultSet.getString("name")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }

    public Category getCategoryByName(String name) {
        String query = "SELECT * FROM category WHERE name = ?";
        Category foundCategory = null;

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)

        ) {
            preparedStatement.setString(1, name);
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    foundCategory = new Category(resultSet.getInt("category_id"), resultSet.getString("name"));
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return foundCategory;
    }

    public Category getCategoryById(int id) {
        String query = "SELECT * FROM category WHERE category_id = ?";
        Category foundCategory = null;

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setInt(1, id);
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    foundCategory = new Category(resultSet.getInt("category_id"), resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return foundCategory;
    }
}
