package week7.lambdas;

@FunctionalInterface
public interface Calculator {
    // functional interface is an interface with only 1 abstract method
    double calc(double a, double b);
}
