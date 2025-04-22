package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionExample {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean gettingNr = true;
        while(gettingNr) {
            try {
                System.out.println("Please enter a nr:");
                int nr = scanner.nextInt();
                System.out.println("I love " + nr + ". It's my favorite number.");
                gettingNr = false;
            } catch(InputMismatchException e) {
                scanner.nextLine();
                System.out.println("That doesn't seem to be a number...");
            }
        }

    }
}
