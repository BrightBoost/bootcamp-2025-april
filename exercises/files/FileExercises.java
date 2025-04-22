
import java.io.*;
import java.util.*;

public class FileExercises {

    public static void main(String[] args) {
        writeSingleLine();
        readSingleLine();
        writeArrayLines();
        readPoemLineByLine();
        saveUserInput();
        readLinesToUppercase();
        countWordOccurrences();
        saveBooksToFile();
        loadBooksFromFile();
        appendBookFromInput();
    }

    // 1. Write a single line to a file
    public static void writeSingleLine() {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, file world!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2. Read that line back
    public static void readSingleLine() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3. Write multiple lines from an array
    public static void writeArrayLines() {
        String[] lines = {"Roses are red", "Violets are blue", "Java is sweet", "And so are you"};
        try {
            FileWriter writer = new FileWriter("poem.txt");
            for (int i = 0; i < lines.length; i++) {
                writer.write(lines[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4. Read file line-by-line and print
    public static void readPoemLineByLine() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5. Ask the user for lines and save to a file
    public static void saveUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("user_input.txt");
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter line " + (i + 1) + ": ");
                String input = scanner.nextLine();
                writer.write(input + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 6. Read lines into an array and print in uppercase
    public static void readLinesToUppercase() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i).toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 7. Count how many times a word appears
    public static void countWordOccurrences() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String search = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"));
            int count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(search)) {
                    count++;
                }
            }
            reader.close();
            System.out.println("The word '" + search + "' appeared in " + count + " line(s). ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Book class for exercises 8-10
    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String toFileString() {
            return title + ";" + author;
        }
    }

    // 8. Save array of Book objects to file
    public static void saveBooksToFile() {
        Book[] books = {
            new Book("Clean Code", "Robert C. Martin"),
            new Book("Effective Java", "Joshua Bloch"),
            new Book("Head First Java", "Kathy Sierra")
        };

        try {
            FileWriter writer = new FileWriter("books.txt");
            for (int i = 0; i < books.length; i++) {
                writer.write(books[i].toFileString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 9. Read file and create Book objects
    public static void loadBooksFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("books.txt"));
            List<Book> books = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                Book book = new Book(parts[0], parts[1]);
                books.add(book);
            }
            reader.close();

            for (Book b : books) {
                System.out.println(b.title + " by " + b.author);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 10. Append a user-created Book to the file
    public static void appendBookFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        try {
            FileWriter writer = new FileWriter("books.txt", true); // true = append mode
            writer.write(book.toFileString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
