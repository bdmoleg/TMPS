public class MacOsScrollBar extends ScrollBar{
    @Override
    public void scrollDown() {
        System.out.println("Scroll it slowly in MacOS");
    }

    @Override
    public void scrollUp() {
        System.out.println("Scroll up and up and up in MacOs");
    }
}
