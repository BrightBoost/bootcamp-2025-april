package week7.lambdas;

import week7.interfaces.workingwith.Person;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<week7.interfaces.workingwith.Person> persons = new ArrayList<week7.interfaces.workingwith.Person>();
        persons.add( new week7.interfaces.workingwith.Person("Zach", "Wyatt", 63) );
        persons.add( new week7.interfaces.workingwith.Person("Dana", "Wyatt", 31) );
        persons.add( new week7.interfaces.workingwith.Person("Elisha", "Aslan", 14) );
        persons.add( new week7.interfaces.workingwith.Person("Ian", "Auston", 16) );
        persons.add( new week7.interfaces.workingwith.Person("Zephaniah", "Hughes", 9) );
        persons.add( new Person("Ezra", "Aiden", 17) );

        persons.stream()
                .filter(p -> p.getFirstName().startsWith("Z"))
                .forEach(p -> System.out.println(p));

        System.out.println("***********");

        persons.sort((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        persons.stream().forEach(p -> System.out.println(p));
    }
}
