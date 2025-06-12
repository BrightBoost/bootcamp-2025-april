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
        System.out.println("4) Add language");
        System.out.println("5) Update language");
        System.out.println("6) Delete language");
        System.out.println("0) Exit");

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
                System.out.println("What language do you want to add?");
                Language language = new Language();
                language.setName(scanner.nextLine());
                languageDAO.add(language);
                break;
            case "5":
                System.out.println("What is the id you want to update?");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("What language do you want to change it to?");
                language = new Language();
                language.setName(scanner.nextLine());
                languageDAO.update(id, language);
                break;
            case "6":
                System.out.println("What is the id you want to delete?");
                int idTobeDeleted = Integer.parseInt(scanner.nextLine());
                languageDAO.delete(idTobeDeleted);
                break;
            case "0":
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
