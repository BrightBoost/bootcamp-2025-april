package week1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // create scanner
        Scanner reader = new Scanner(System.in);

        // 2 floating point nrs
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();

        reader.nextLine();

        // asks operation
        System.out.println("Do you want to add, subtract, multiply or divide?");
        String operation = reader.nextLine();
        System.out.println("You've chosen " + operation);

        // multiply
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }
}
