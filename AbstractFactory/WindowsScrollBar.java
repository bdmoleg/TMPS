// Concrete Product (pattern Abstract Factory)

public class WindowsScrollBar extends ScrollBar{
    @Override
    public void scrollDown() {
        System.out.println("Scroll it slowly in Windows");
    }

    @Override
    public void scrollUp() {
        System.out.println("Scroll up and up and up in Windows");
    }
}
