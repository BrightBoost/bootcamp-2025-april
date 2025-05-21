package week7.lambdas;

import java.time.LocalDate;
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
    }
}
