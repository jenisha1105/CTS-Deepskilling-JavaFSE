interface Document {
    void open();
}

class WordDocument implements Document {

    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {

    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument implements Document {

    public void open() {
        System.out.println("Opening Excel Document");
    }
}

class DocumentFactory {

    public Document createDocument(String type) {

        if (type.equalsIgnoreCase("WORD")) {
            return new WordDocument();
        }

        else if (type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        }

        else if (type.equalsIgnoreCase("EXCEL")) {
            return new ExcelDocument();
        }

        return null;
    }
}

public class FactoryMethodPattern {

    public static void main(String[] args) {

        DocumentFactory factory = new DocumentFactory();

        Document doc1 = factory.createDocument("WORD");
        Document doc2 = factory.createDocument("PDF");
        Document doc3 = factory.createDocument("EXCEL");

        doc1.open();
        doc2.open();
        doc3.open();
    }
}
