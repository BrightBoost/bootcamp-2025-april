package week6.polymorphism;

public class Document {
    private String name;
    private String extension;
    private String content;
    private Owner owner;


    public Document(String name, String extension, String content, Owner owner) {
        this.name = name;
        this.extension = extension;
        this.content = content;
        this.owner = owner;
        if(owner != null) {
            owner.addDocumentToDocumentList(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
