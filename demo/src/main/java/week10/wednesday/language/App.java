package week10.wednesday.language;

import org.apache.commons.dbcp2.BasicDataSource;
import week10.wednesday.Product;

import java.util.List;
import java.util.Scanner;

public class App {
    private static LanguageDAO languageDAO;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        init(args);
        while(runMenu()) {

        }
    }

    public static boolean runMenu() {
        System.out.println("What do you want to do?");
        System.out.println("1) Get all languages");
        System.out.println("2) Get language by name");
        System.out.println("3) Get language by id");
        System.out.println("4) Exit");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                printLanguages(languageDAO.getAll());
                break;
            case "2":
                System.out.println("What name?");
                printLanguages(List.of(languageDAO.getLanguageByName(scanner.nextLine())));
                break;
            case "3":
                System.out.println("What id?");
                printLanguages(List.of(languageDAO.getLanguageById(Integer.parseInt(scanner.nextLine()))));
                break;
            case "4":
                return false;
        }
        return true;
    }
    public static void printLanguages(List<Language> languages) {
        for(Language language : languages) {
            System.out.println(language);
        }
    }

    public static void init(String[] args) {
        String username = args[0];
        String password = args[1];
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/Sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        languageDAO =
                new LanguageDAO(dataSource);
    }
}
