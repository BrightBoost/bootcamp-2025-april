package week1;

import java.util.Scanner;

public class MoreScannerExplained {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("You are " + name + " and you are " + age + " years old." );
    }
}
