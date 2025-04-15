package week2;

import java.util.Scanner;

public class SandwichShop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt for size
        int sizeOfSandwich = getSandwichSize();

        // prompt for age
        int inputtedAge = getAge();

        // calculate price
        double total = calculateTotalPrice(sizeOfSandwich, inputtedAge);

        // display costs
        displayTotal(total);
    }

    public static int getSandwichSize() {
        System.out.println("Do you want regular(1) or large(2)?");
        int sizeOfSandwich = scanner.nextInt();
        return sizeOfSandwich;
    }

    public static int getAge() {
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        return age;
    }

    public static double calculateTotalPrice(int sandwichSize, int age) {
        double totalPrice = 0;

        if(sandwichSize == 1) {
            totalPrice = 5.45;
        } else if(sandwichSize == 2) {
            totalPrice = 8.95;
        }

        if(age <= 17) {
            totalPrice *= 0.9;
        } else if(age >= 65) {
            totalPrice *= 0.8;
        }

        return totalPrice;
    }

    public static void displayTotal(double total) {
        System.out.println("The total costs are: " + total);
    }

}
