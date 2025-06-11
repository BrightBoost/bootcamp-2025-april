package week10.wednesday;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class App {
    private static NorthwindDataManager dataManager;

    public static void main(String[] args) {
        init(args);
        List<Product> products = dataManager.getAllProducts();
        products.forEach(System.out::println);
    }

    public static void init(String[] args) {
        String username = args[0];
        String password = args[1];
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/Northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataManager =
                new NorthwindDataManager(dataSource);
    }
}
