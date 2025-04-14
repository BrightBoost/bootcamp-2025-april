package week2;

import java.util.Scanner;

public class PayrollCalculatorWithMethods {

    public static void main(String[] args) {
        // create a scanner object
        Scanner scanner = new Scanner(System.in);

        // get name
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        // hours worked
        System.out.println("Enter hours worked, please: ");
        double hrsWorked = scanner.nextDouble();

        // pay rate
        System.out.println("Please enter pay rate: ");
        final double payRate = scanner.nextDouble();

        calcGrossPay(name, hrsWorked, payRate);
    }

    public static void calcGrossPay(String name, double hrsWorked, double payRate) {
        // calc gross pay include overtime for 1.5x pay
        double grossPay = 0;
        // check for overtime
        if (hrsWorked > 40) {
            // if there's overtime >> those hours have a special rate
            grossPay += (hrsWorked - 40) * payRate * 1.5;
            grossPay += 40 * payRate;
        } else {
            // everything under 40 hours is normal rate
            grossPay += hrsWorked * payRate;
        }
        // display name + pay
        System.out.println(name + " has " + grossPay + " as a salary.");
    }
}
