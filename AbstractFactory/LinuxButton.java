public class LinuxButton implements Button {
    @Override
    public void press() {
        System.out.println("Button Linux Press");
    }

    @Override
    public void drop() {
        System.out.println("Button Linux Drop");
    }
}
