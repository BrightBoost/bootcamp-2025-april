package week2;

import java.util.Scanner;

public class FullNameApplication {
    //    Glen Williams
//    Glen C. Williams
//    Glen Williams, PhD
//    Glen C. Williams, PhD
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(namePrompter());
        System.out.println("What is your full name?");
        fullNameParser(scanner.nextLine());
    }

    public static String namePrompter() {
        System.out.println("What is your first name?");
        String name = scanner.nextLine().trim();
        System.out.println("Do you have a middle name? (y/n)");
        String hasMiddleName = scanner.nextLine();
        if(hasMiddleName.equalsIgnoreCase("y")) {
            System.out.println("What is your middle name?");
            name += " " + scanner.nextLine().trim();
        }
        System.out.println("What is your last name?");
        name += " " + scanner.nextLine().trim(); // name = name + " " + scanner.nextLine().trim();
        System.out.println("Do you have a suffix? (y/n)");
        String hasSuffix = scanner.nextLine();
        if(hasSuffix.equalsIgnoreCase("y")) {
            System.out.println("What is your suffix?");
            name += ", " + scanner.nextLine().trim();
        }
        return name;
    }

    public static void fullNameParser(String fullName) {
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String middleName = "(none)";
        String lastName = "";
        if(nameParts.length == 2) {
            lastName = nameParts[1];
        } else {
            middleName = nameParts[1];
            lastName = nameParts[2];
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}
