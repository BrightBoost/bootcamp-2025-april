package week6.polymorphism;

public class PdfDocument extends Document {
    private boolean locked;

    public PdfDocument(String name, String content, Owner owner, boolean locked) {
        super(name, "pdf", content, owner);
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
