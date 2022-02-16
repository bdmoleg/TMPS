// Concrete Factory (pattern Abstract Factory)

public class MacOsConcreteFactory implements OSAbstractFactory{
    @Override
    public Button createButtonProduct() {
        return new MacOsButton();
    }

    @Override
    public TextArea createTextAreaProduct() {
        return new MacOsTextArea();
    }

    @Override
    public ScrollBar createScrollBarProduct() {
        return new MacOsScrollBar();
    }
}