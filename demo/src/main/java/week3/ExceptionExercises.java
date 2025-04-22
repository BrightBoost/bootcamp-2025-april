package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        addThreeNumbers();
        scanner.close();

    }

    // 1 divide two nrs
    public static void divideTwoNumbers() {
        try {
            System.out.println("enter a nr: ");
            int nr1 = scanner.nextInt();
            System.out.println("enter another nr: ");
            int nr2 = scanner.nextInt();
            int result = nr1/nr2;
        } catch (ArithmeticException e) {
            System.out.println("I cannot divide by 0.");
        } catch(InputMismatchException e) {
            System.out.println("That's not a number.");
        }
    }

    // 3 get age input
    public static void getAgeInput() {
        System.out.println("Please enter your age:");
        boolean ageSuccessFullyEntered = false;
        int age = -1;
        while(!ageSuccessFullyEntered) {
            try {
                age = Integer.parseInt(scanner.nextLine());
                ageSuccessFullyEntered = true;
            } catch(NumberFormatException e) {
                System.out.println("That is not a number. Try again!");
            }
        }
        System.out.println("Okay, you're " + age + " years old.");
    }

    // 8 ask 3 numbers and add them
    public static void addThreeNumbers() {
        int count = 0;
        int total = 0;
        while(count < 3) {
            System.out.println("Please enter number " + (count + 1));
            try {
                int nr = scanner.nextInt();
                total += nr;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("that is not a number, please go again.");
                scanner.nextLine();
            }
        }
        System.out.println(total);
    }

}
