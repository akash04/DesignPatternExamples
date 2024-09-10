public class Abstract {
}

// Abstract product family for Buttons
interface Button {
    void click();
}

class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button clicked");
    }
}

class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOS Button clicked");
    }
}

// Abstract product family for Menus
interface Menu {
    void display();
}

class WindowsMenu implements Menu {
    @Override
    public void display() {
        System.out.println("Windows Menu displayed");
    }
}

class MacOSMenu implements Menu {
    @Override
    public void display() {
        System.out.println("MacOS Menu displayed");
    }
}

// Abstract Factory
interface UIComponentsFactory {
    Button createButton();
    Menu createMenu();
}

// Concrete Factory for Windows
class WindowsFactory implements UIComponentsFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}

// Concrete Factory for MacOS
class MacOSFactory implements UIComponentsFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}

// Client code
public class Application {
    private Button button;
    private Menu menu;

    public Application(UIComponentsFactory factory) {
        button = factory.createButton();
        menu = factory.createMenu();
    }

    public void run() {
        button.click();
        menu.display();
    }

    public static void main(String[] args) {
        UIComponentsFactory factory = new WindowsFactory(); // or new MacOSFactory()
        Application app = new Application(factory);
        app.run();
    }
}

