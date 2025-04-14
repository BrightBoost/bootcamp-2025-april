package week2.scannerorganization;

import java.util.Scanner;

public class OneStaticScannerObject {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("🧙 Welcome, traveler! You must solve 3 riddles to pass the gate.");
        askRiddleOne();
        askRiddleTwo();
        askRiddleThree();
        System.out.println("🎉 You have passed the gate!");
        scanner.close();
    }

    public static void askRiddleOne() {
        System.out.print("Riddle 1: What has to be broken before you can use it? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("egg")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Nope, it's an egg. But we'll let it slide.");
        }
    }

    public static void askRiddleTwo() {
        System.out.print("Riddle 2: I speak without a mouth and hear without ears. What am I? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("echo")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! It was an echo. But carry on...");
        }
    }

    public static void askRiddleThree() {
        System.out.print("Riddle 3: What has hands but can’t clap? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("clock")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. A clock was the answer. But you're through anyway!");
        }
    }
}
