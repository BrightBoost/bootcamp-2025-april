package week2;

import java.util.Scanner;

public class MoreMethodsExplained {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = getAgeUser(scanner);
        String username = getNameUser(scanner);
        System.out.println(nr + " " + username);

        sillyDemo(scanner);
        scanner.close();
    }

    public static void sillyDemo(Scanner scanner) {
        int x =  scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(x);
        System.out.println(s);
    }
    public static int getAgeUser(Scanner scanner) {
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        if(age >= 0) {
            return age;
        } else {
            return -1;
        }

    }

    public static String getNameUser(Scanner scanner) {
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        return name;
    }
}
