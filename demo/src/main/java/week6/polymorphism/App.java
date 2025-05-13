package week6.polymorphism;

public class App {
    public static void main(String[] args) {
        Owner owner = new Owner("Hans", false);
        Document document1 = new Document("general", "txt", "blablabla", owner);
        PdfDocument document2 = new PdfDocument("workbook5", "all sorts of oop stuff", owner, true);
        SpreadsheetDocument document3 = new SpreadsheetDocument("progress", "xclx", "tables", owner, false);

        for(Document d : owner.getDocumentList()) {
            d.readContent();
            if(d instanceof PdfDocument pdfDocument) {
                System.out.println(pdfDocument.isLocked());
            }
        }

        System.out.println(owner);    }
}
