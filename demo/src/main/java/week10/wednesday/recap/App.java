package week10.wednesday.recap;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class App {
    private static CategoryDAO categoryDAO;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        init(args);
        homeScreen();
    }

    public static void homeScreen() {
        System.out.println("What do you want to do?");
        System.out.println("1) See all categories!");
        System.out.println("2) See category by name");
        System.out.println("3) See category by ID");
        System.out.println("0) Exit.");
        String response = scanner.nextLine();

        switch (response) {
            case "1":
                printCategories(categoryDAO.getAll());
                break;
            case "2":
                System.out.println("What category are you looking for?");
                printCategories(List.of(categoryDAO.getCategoryByName(scanner.nextLine())));
                break;
            case "3":
                System.out.println("What id are you looking for?");
                printCategories(List.of(categoryDAO.getCategoryById(Integer.parseInt(scanner.nextLine()))));
                break;
            case "4":
                System.out.println("Ok bye.");
                break;
        }
    }

    public static void printCategories(List<Category> categories) {
        for(Category category : categories) {
            System.out.println(category.getName() + " - " + category.getId());
        }
    }

    public static void init(String[] args) {
        if(args.length != 2) {
            System.out.println("I need 2 arguments!");
            System.exit(1);
        }

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUsername(args[0]);
        dataSource.setPassword(args[1]);
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");

        categoryDAO = new CategoryDAO(dataSource);
    }
}
