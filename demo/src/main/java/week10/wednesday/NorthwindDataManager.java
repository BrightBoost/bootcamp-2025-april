package week10.wednesday;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NorthwindDataManager {
    private DataSource dataSource;
    public NorthwindDataManager(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT ProductID " +
                " , ProductName " +
                " , UnitPrice " +
                "FROM products;";
        try (
            Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet results = statement.executeQuery();
        ) {
            while (results.next())
            {
                int id = results.getInt("ProductID");
                String name = results.getString("ProductName");
                double price = results.getDouble("UnitPrice");
                Product product = new Product(id, name, price);
                products.add(product);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

}
