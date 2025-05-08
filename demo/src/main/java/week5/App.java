package week5;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Human.displayHumanInfo();

        Human human1 = new Human("Frederika", LocalDate.of(2000, 1, 1));
        Human human2 = new Human("Jan", LocalDate.of(1960, 2, 3));

        System.out.println(human1.populationCount); // 2
        System.out.println(human2.populationCount); //2

        human2.populationCount = 34;
        System.out.println(human1.populationCount); // 34
        System.out.println(human2.populationCount); /* 34 */

        System.out.println(Human.populationCount); // 34
        Human.displayHumanInfo();

    }
}
