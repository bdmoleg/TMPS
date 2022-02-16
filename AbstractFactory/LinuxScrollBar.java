// Concrete Product (pattern Abstract Factory)

public class LinuxScrollBar extends ScrollBar{
    @Override
    public void scrollDown() {
        System.out.println("Scroll it slowly in Linux");
    }

    @Override
    public void scrollUp() {
        System.out.println("Scroll up and up and up in Linux");
    }
}
