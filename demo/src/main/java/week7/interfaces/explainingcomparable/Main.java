package week7.interfaces.explainingcomparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document document1 = new Document("abv.txt", "text....");
        Document document2 = new Document("naaa.txt", "something about interfaces....");
        Document document3 = new Document("de.txt", "more text....");

        List<Document> documentList = new ArrayList<>();
        documentList.add(document1);
        documentList.add(document2);
        documentList.add(document3);

        for(Document d : documentList) {
            System.out.println(d.getName());
        }
        System.out.println("------");
        Collections.sort(documentList);
        for(Document d : documentList) {
            System.out.println(d.getName());
        }



    }
}
