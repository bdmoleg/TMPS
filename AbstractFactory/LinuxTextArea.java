// Concrete Product (pattern Abstract Factory)

public class LinuxTextArea implements TextArea{
    @Override
    public void selectPartialText() {
        System.out.println("Select very carefully text from Linux text area");
    }

    @Override
    public void pasteText() {
        System.out.println("Use Linux CTRL + V");
    }
}