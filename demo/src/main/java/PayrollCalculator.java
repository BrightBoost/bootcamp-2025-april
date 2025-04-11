import java.util.Scanner;

public class PayrollCalculator {
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
        double payRate = scanner.nextDouble();

        // calc gross pay
        double grossPay = hrsWorked * payRate;

        // display name + pay
        System.out.println(name + " has " + grossPay + " as a salary.");
    }
}
