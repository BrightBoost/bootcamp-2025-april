package week2.scannerorganization;

import java.util.Scanner;

public class PassingScannerAroundVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🧙 Welcome, traveler! You must solve 3 riddles to pass the gate.");
        askRiddleOne(scanner);
        askRiddleTwo(scanner);
        askRiddleThree(scanner);
        System.out.println("🎉 You have passed the gate!");

        scanner.close();
    }

    public static void askRiddleOne(Scanner scanner) {
        System.out.print("Riddle 1: What has to be broken before you can use it? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("egg")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Nope, it's an egg. But we'll let it slide.");
        }
    }

    public static void askRiddleTwo(Scanner scanner) {
        System.out.print("Riddle 2: I speak without a mouth and hear without ears. What am I? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("echo")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! It was an echo. But carry on...");
        }
    }

    public static void askRiddleThree(Scanner scanner) {
        System.out.print("Riddle 3: What has hands but can’t clap? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("clock")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. A clock was the answer. But you're through anyway!");
        }
    }
}
