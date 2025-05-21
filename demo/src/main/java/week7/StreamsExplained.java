package week7;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamsExplained {
    public static void main(String[] args) {
        // built in functional interfaces
        // consumer - takes an argument and returns nothing
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("lalala");

        // predicate
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(5));
        // supplier
        Supplier<String> stringSupplier = () -> "HELLO";
        System.out.println(stringSupplier.get());

        // function
        Function<Integer, Integer> integerFunction = nr -> nr + 2;
        System.out.println(integerFunction.apply(5));

        System.out.println("*** streams start here");
        // Stream API
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Anything");

        List<String> stringListAfterStream = list.stream() //stream start / source
                .filter(s -> s.startsWith("A"))
                .peek(s -> System.out.println(s)) // intermediate
                .toList(); // terminal operation - no longer a stream

        System.out.println("****");

        list.stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));
        
        System.out.println("***");
        long count = list.stream() //stream start / source
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(count);

        System.out.println("***");
        List<String> stringListAfterStream2 = list.stream() //stream start / source
                .sorted((s1, s2) -> s1.length() - s2.length())
                .peek(s -> System.out.println(s))
                .toList(); // terminal operation - no longer a stream
    }
}
