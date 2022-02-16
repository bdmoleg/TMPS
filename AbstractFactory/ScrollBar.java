// Abstract Product (pattern Abstract Factory)

public abstract class ScrollBar {
    public abstract void scrollDown();
    public abstract void scrollUp();

    public void sayHelloTo(String toWhom) {
        System.out.println("Hello " + toWhom);
    }

}


