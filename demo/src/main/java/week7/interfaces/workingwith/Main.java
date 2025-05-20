package week7.interfaces.workingwith;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Zach", "Wyatt", 63) );
        myFamily.add( new Person("Dana", "Wyatt", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        Collections.sort(myFamily);

        for(Person p: myFamily) {
            System.out.println(p);
        }

    }
}
