public class MacOsButton implements Button {
    @Override
    public void press() {
        System.out.println("Button MacOs Press");
    }

    @Override
    public void drop() {
        System.out.println("Button MacOs Drop");
    }
}
