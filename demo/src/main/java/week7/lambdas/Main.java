package week7.lambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creating an instance of calculator
        Adder adder = new Adder();
        Adder adder1 = new Adder();
        Adder adder2 = new Adder();
        Adder adder3 = new Adder();

        // anonymous implementation of calculator
        Calculator multiplier = new Calculator() {
            @Override
            public double calc(double a, double b) {
                return a * b;
            }
        }; // needed because it's actually one statement

        multiplier.calc(3, 5);

        // when we want to implement a functional interface anonymously
        // we can do this with the lambda syntax
        // since it's only 1 abstract method, we know the implementation will be for that one method
        // we can deduct the type by looking at the lefthand side
        // (parameters) -> body
        // return keyword must be omitted if it's only 1 line implementation
        // there are special rules for lambda bodies with multiple lines. Not discussed now.
        Calculator multiplier2 = (a, b) -> a * b; // a and b becomes a times b
        multiplier2.calc(4, 5);

        Printer printer = (s) -> System.out.println("Printer says: " + s); // s is picked up and printed
        printer.print("hi");


        // if a lambda has only 1 argument, you can omit the  ()
        Printer printer1 = s -> System.out.println("Another printer says: " + s);
        printer1.print("hello");

        Provider provider = () -> LocalDate.now(); // nothing becomes current date
        System.out.println(provider.provide());

        // ex2
        NumericOperator numericOperator = (a, b) -> a + b;
        System.out.println(numericOperator.operate(4, 5));

        CompareLogic compareLogic = (s1, s2) -> s1.length() - s2.length();
        System.out.println(compareLogic.compare("hi", "hello"));

        // ex3
        NumericOperator numericOperator1 = (a, b) -> a > b ? a : b;
        System.out.println(numericOperator1.operate(7, 8));

        // ex5
        StringFormatter stringFormatter = s -> s.toUpperCase();
        System.out.println(stringFormatter.format("blablabla"));

        // ex7
        UnaryOperator unaryOperator = i -> i * i;
        System.out.println(unaryOperator.apply(5));

        // ex9
        TriFunction triFunction = (x, y, z) -> (x + y + z) / 3.0;
        System.out.println(triFunction.apply(2, 5, 7));

        // ex11
        Printer printer2 = s -> System.out.println(s);
        printer2.print("hallo");

        // ex 13
        Predicate<String> predicate = s -> s.isEmpty();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("  "));

        // ex14
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Anything");
        processStrings(s -> s.startsWith("A"), list);
        System.out.println("***");
        processStrings(s -> s.length() > 5, list);
    }

    // ex14
    public static void processStrings(Predicate<String> predicate, List<String> strings) {
        for(String string : strings) {
            if(predicate.test(string)) {
                System.out.println(string);
            }
        }
    }
}
