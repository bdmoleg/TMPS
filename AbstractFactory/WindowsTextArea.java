// Concrete Product (pattern Abstract Factory)

public class WindowsTextArea implements TextArea{
    @Override
    public void selectPartialText() {
        System.out.println("Select not so very carefully text from Windows text area");
    }

    @Override
    public void pasteText() {
        System.out.println("Use Windows CTRL + V");
    }
}
