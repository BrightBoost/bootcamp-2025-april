package week7;

@FunctionalInterface
public interface Checker<T> {
    boolean check(T value);
}
