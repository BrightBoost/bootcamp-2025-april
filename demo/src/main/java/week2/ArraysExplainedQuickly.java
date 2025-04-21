package week2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ArraysExplainedQuickly {
    public static void main(String[] args) {
        String topics = "Java | Git | Spring";
        String[] topicsArr = topics.split(Pattern.quote("|"));
        System.out.println(topicsArr[0]);

        String[] hobbies = {"fitness", "coding", "jigsaw puzzles"};
        System.out.println(hobbies[0]);
        System.out.println(hobbies[1]);
        System.out.println(hobbies[2]);

        // for loop(create counter; condition; action for after every iteration)
        for(int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
        }

        // while loop - normally not for things you can count, you'd use a for
        // it's used for as long as (literally WHILE such and so is true, do this and that)
        int counter = 0;
        while(counter < 10) {
            System.out.println(counter);
            counter = counter + 1;
        }

        // maaike's preferred way
        boolean condition = true;
        while(condition) {
            if(Math.random() < 0.2) {
                System.out.println("snapping out of the loop");
                condition = false;
            } else {
                System.out.println("keep going");
            }
        }

        // alternative with break keyword
        while(true) {
            if(Math.random() < 0.2) {
                System.out.println("snapping out of the loop");
                break;
            }
            System.out.println("keep going");
        }

        Scanner scanner = new Scanner(System.in);
        int nr = 0;
        while (nr < 1 || nr > 10) {
            System.out.println("Enter a number between 1 and 10:");
            nr = scanner.nextInt();
        }

        // do while loop
        // execute once, then check the while condition
        int newNr = 8;
        do {
            System.out.println("DOWHILE: Enter a number between 1 and 10:");
            newNr = scanner.nextInt();
        } while(newNr < 1 || newNr > 10);


        char[] charArr = {'c', 'o', 'd', 'i', 'n', 'g'};

        boolean[] arrBooleans = {true, false, true, false, true};



    }
}
