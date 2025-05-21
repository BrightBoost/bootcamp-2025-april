package week7.lambdas;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
