import java.util.Scanner;

public class ScannerExplained {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, who are you?");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
        System.out.print("Please enter your weight in kgs: ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // eating the newline char from the input
        System.out.println();
        System.out.print("Please enter your height in meters: ");
        double height = scanner.nextDouble();
        scanner.nextLine(); // eating the newline char from the input
        double bmi = weight / Math.pow(height, 2);
        System.out.println("Here's your bmi: " + bmi);
        System.out.println("Do you want coffee?");
        String coffee = scanner.nextLine();
        System.out.println("You said '" + coffee + "' to coffee");
        System.out.println("Do you want coffee?");
        String coffee2 = scanner.nextLine();
        System.out.println("You said '" + coffee2 + "' to coffee");

    }
}
