package week6.polymorphism;

public class SpreadsheetDocument extends Document {
    public boolean secretInformation;

    public SpreadsheetDocument(String name, String extension, String content, Owner owner, boolean secretInformation) {
        super(name, extension, content, owner);
        this.secretInformation = secretInformation;
    }

    public boolean isSecretInformation() {
        return secretInformation;
    }

    public void setSecretInformation(boolean secretInformation) {
        this.secretInformation = secretInformation;
    }
}
