// Concrete Factory (pattern Abstract Factory)

public class LinuxConcreteFactory implements OSAbstractFactory{
    @Override
    public Button createButtonProduct() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextAreaProduct() {
        return new LinuxTextArea();
    }

    @Override
    public ScrollBar createScrollBarProduct() {
        return new LinuxScrollBar();
    }
}