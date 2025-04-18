package week2;

import java.util.Scanner;

public class RefactorStringBuilderExercise {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Please provide the following information:");

        sb.append(getUserInput("Full name:")).append("\n");
        addAddressToStringBuilder(sb, "Billing");
        addAddressToStringBuilder(sb, "Shipping");

        String address = sb.toString();
        System.out.println(address);
    }

    public static void addAddressToStringBuilder(StringBuilder sb, String typeOfAddress) {
        sb.append(typeOfAddress).append(" Address:\n");
        sb.append(getUserInput(typeOfAddress + " street")).append("\n");
        sb.append(getUserInput(typeOfAddress + " state :")).append(", ");
        sb.append(getUserInput(typeOfAddress + " zip :")).append("\n\n");
    }

    public static String getUserInput(String promptMessage) {
        System.out.println(promptMessage);
        return scanner.nextLine();
    }
}
