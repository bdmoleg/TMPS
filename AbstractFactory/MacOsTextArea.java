public class MacOsTextArea implements TextArea{
    @Override
    public void selectPartialText() {
        System.out.println("Select not so very carefully text from MacOs text area");
    }

    @Override
    public void pasteText() {
        System.out.println("Use MacOs CTRL + V");
    }
}
