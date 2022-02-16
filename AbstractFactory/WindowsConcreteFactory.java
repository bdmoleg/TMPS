// Concrete Factory (pattern Abstract Factory)

public class WindowsConcreteFactory implements OSAbstractFactory{

    @Override
    public Button createButtonProduct() {
        return new WindowsButton();
    }

    @Override
    public TextArea createTextAreaProduct() {
        return new WindowsTextArea();
    }

    @Override
    public ScrollBar createScrollBarProduct() {
        return new WindowsScrollBar();
    }
}