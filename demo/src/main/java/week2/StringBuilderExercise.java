package week2;

import java.util.Scanner;

public class StringBuilderExercise {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Please provide the following information:");
        System.out.println("Full name:");
        sb.append(scanner.nextLine()).append("\n\nBilling Address:\n");
        System.out.println("Billing street :");
        sb.append(scanner.nextLine()).append("\n");
        System.out.println("Billing state :");
        sb.append(scanner.nextLine()).append(", ");
        System.out.println("Billing zip :");
        sb.append(scanner.nextLine()).append("\n\nShipping Address:\n");
        System.out.println("Shipping street :");
        sb.append(scanner.nextLine()).append("\n");
        System.out.println("Shipping state :");
        sb.append(scanner.nextLine()).append(", ");
        System.out.println("Shipping zip :");

        String address = sb.toString();
        System.out.println(address);

    }
}
