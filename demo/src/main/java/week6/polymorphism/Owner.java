package week6.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String username;
    private boolean admin;
    List<Document> documentList = new ArrayList<>();

    public Owner(String username, boolean admin) {
        this.username = username;
        this.admin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void addDocumentToDocumentList(Document document) {
        documentList.add(document);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "username='" + username + '\'' +
                ", admin=" + admin +
                '}';
    }
}
