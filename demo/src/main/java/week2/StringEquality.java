package week2;

import java.util.Locale;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "ABC";
// s2 references the **same string literal**
        String s2 = "ABC";
// But s3 does NOT reference that literal because its // value was created by performing concatenations String s3 = "A" + "B" + "C";
        if (s1 == s2) {
            // this will be true
            System.out.println(" true");

        }
        String s3 = new String("ABC");
        if (s1 == s3) {
            // this will be false even though they both
            // would display the string "ABC"
            System.out.println("actually true");
        }

        String state = "New Mexico";
        String uppercaseState = state.toUpperCase();
        System.out.println(state.equals(uppercaseState));
        System.out.println(state.equalsIgnoreCase(uppercaseState));

        System.out.println(state.substring(4));

        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
        System.out.println(cities[0]);
// cities is an array containing 3 strings

// [0] is Dallas, [1] is Ft. Worth, [2] is Auston

        String fruit1 = "Apple";
        String fruit2 = "Banana";
        System.out.println(fruit1.compareTo(fruit2));

        String noVowels =  fruit2.replaceAll("a", "");
        noVowels =  noVowels.replaceAll("e", "");
        noVowels =  noVowels.replaceAll("i", "");
        noVowels =  noVowels.replaceAll("o", "");
        noVowels =  noVowels.replaceAll("u", "");

        System.out.println(fruit2.length() - noVowels.length());
    }
}
