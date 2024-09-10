// Product interface
interface Document {
    void open();
}

// Concrete products
class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document");
    }
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document");
    }
}

// Creator abstract class
abstract class DocumentCreator {
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}

// Concrete creators
class PDFCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}

class WordCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

// Client code
public class FactoryMethodDemo {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PDFCreator();
        DocumentCreator wordCreator = new WordCreator();

        pdfCreator.openDocument(); // "Opening a PDF document"
        wordCreator.openDocument(); // "Opening a Word document"
    }
}
