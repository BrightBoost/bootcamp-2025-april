package week7.interfaces.exercises;

public class Transformer implements Transformable {
    private String name;
    private boolean transformed;

    public Transformer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTransformed() {
        return transformed;
    }

    @Override
    public void transform() {
        this.transformed = true;
    }
}
