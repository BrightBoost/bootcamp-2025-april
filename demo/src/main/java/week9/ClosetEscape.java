package week9;
import java.io.*;
import java.util.Scanner;


public class ClosetEscape {
    private static final String NOTES_FILE = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're trapped in the closet... and you hear a faint 'meow' in the corner of the closet.");
        System.out.println("It's Zia.");
        System.out.println("Solve the riddles and gather clues to escape together!");

        boolean escaped = false;

        while (!escaped) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Solve a riddle");
            System.out.println("2. Solve the extra riddle.");
            System.out.println("3. Save a clue");
            System.out.println("4. View saved clues");
            System.out.println("5. Try the secret code");
            System.out.println("6. Ask Zia for a clue.");
            System.out.println("7. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    askRiddle(scanner);
                    break;
                case "2":
                    askExtraRiddle(scanner);
                case "3":
                    saveNote(scanner);
                    break;
                case "4":
                    readNotes();
                    break;
                case "5":
                    escaped = tryCode(scanner);
                    break;
                case "6":
                    System.out.println("Zia has no clue. She's been here for over 10 hours already.");
                    return;
                case "7":
                    System.out.println("You gave up... Zia will remember this.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("You escaped! You hear a happy meow as the door swings open.");
    }

    private static void askRiddle(Scanner scanner) {
        System.out.println("Riddle: I start with 'm', end with 'w', and if you know your ABCs, you know my number code. What am I?");
        System.out.println("Hint: Check the red dress, blue jumpsuit, and golden bag in the database.");
    }

    private static void askExtraRiddle(Scanner scanner) {
        System.out.println("Riddle 2: What symbol turns 5 and 3 into 2, and keeps secrets apart?");
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();

        if (answer.contains("-") || answer.equalsIgnoreCase("dash") || answer.equalsIgnoreCase("minus")) {
            System.out.println("Correct! As you've discovered, sometimes it's what's *between* the numbers that matters.");
            System.out.println("Hint saved: The numbers in the code... they are divided by a symbol that makes 5 - 3 = 2.");
            saveNoteDirect("Hint: Use dashes between numbers in the passcode.");
        } else {
            System.out.println("Hmm, not quite. Try again later.");
        }

    }

    private static void saveNote(Scanner scanner) {
        try (FileWriter writer = new FileWriter(NOTES_FILE, true)) {
            System.out.print("Write your note: ");
            String note = scanner.nextLine();
            writer.write(note + System.lineSeparator());
            System.out.println("Note saved!");
        } catch (IOException e) {
            System.out.println("Failed to save note.");
        }
    }

    private static void saveNoteDirect(String note) {
        try (FileWriter writer = new FileWriter(NOTES_FILE, true)) {
            writer.write(note + System.lineSeparator());
        } catch (IOException e) {
            // Do nothing if it fails silently
            // bad practice though
        }
    }


    private static void readNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(NOTES_FILE))) {
            System.out.println("Your saved clues:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (IOException e) {
            System.out.println("No saved notes found.");
        }
    }

    private static boolean tryCode(Scanner scanner) {
        System.out.print("Enter the secret numeric code: ");
        String attempt = scanner.nextLine();

        if (attempt.equals(DontOpen.ALMOST_SECRET_CODE)) {
            System.out.println("Close... but some ears need to hear things twice.");
            System.out.println("Hint saved: Sometimes a single meow isn't enough.");
            saveNoteDirect("Hint: The word might be repeated.");
            return false;
        }

        if (attempt.equals(DontOpen.SECRET_CODE)) {
            return true;
        } else {
            System.out.println("Wrong code. Keep looking for clues!");
            return false;
        }
    }
}

