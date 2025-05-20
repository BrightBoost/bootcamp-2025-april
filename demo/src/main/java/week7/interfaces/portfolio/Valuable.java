package week7.interfaces.portfolio;

public interface Valuable extends Comparable<Valuable> {
    double getValue();

    default int compareTo(Valuable o) {
        return (int) (this.getValue() - o.getValue());
    }
}
