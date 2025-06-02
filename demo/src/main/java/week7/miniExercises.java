package week7;

import java.util.function.DoubleBinaryOperator;

public class miniExercises {
    public static void main(String[] args) {
        // ch16
        DoubleBinaryOperator dbo = (a, b) -> a * b;
        double a = 4.5, b = 3.2;
        System.out.println(dbo.applyAsDouble(a, b));

        System.out.println("**** \uD83E\uDD99 ****");

        //ch17
        NameCombiner nc = (n1, n2) -> n1 + " " + n2;
        System.out.println(nc.combine("Ada", "Lovelace"));

        System.out.println("**** \uD83E\uDD99 ****");

        //ch18
        Checker<String> checker = s -> {
            StringBuilder sb = new StringBuilder(s);
            if(sb.reverse().toString().equalsIgnoreCase(s)) {
                return true;
            } else {
                return false;
            }
        };

        String[] words = {"level", "banana", "madam", "world"};

        for(String word : words) {
            System.out.println("palindrome check for " + word + ": " + checker.check(word));
        }


    }
}
