import java.util.Objects;

public class WindowsButton implements Button, Cloneable {
    @Override
    public void press() {
        System.out.println("Button Windows Press");
    }

    @Override
    public void drop() {
        System.out.println("Button Windows Drop");
    }


}
