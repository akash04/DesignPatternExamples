// Component
interface Text {
    String format();
}

// Concrete component
class PlainText implements Text {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text;
    }
}

// Decorator
abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }
}

// Concrete Decorators
class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<b>" + text.format() + "</b>";
    }
}

class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<i>" + text.format() + "</i>";
    }
}

// Client code
public class TextEditor {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello World");

        Text boldText = new BoldDecorator(plainText);
        Text italicText = new ItalicDecorator(boldText);

        System.out.println(plainText.format()); // "Hello World"
        System.out.println(boldText.format()); // "<b>Hello World</b>"
        System.out.println(italicText.format()); // "<i><b>Hello World</b></i>"
    }
}
