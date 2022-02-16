import java.util.Properties;

public class MainClient {

    public static void main(String[] args) throws InterruptedException {

/*        OSAbstractFactory factory = new WindowsConcreteFactory();

        TextArea t = factory.createTextAreaProduct();
        ScrollBar s = factory.createScrollBarProduct();

        t.pasteText();
        s.scrollDown();

        s.sayHelloTo("Gheorghe");*/

/*        BigInterface b1 = new ConcreteClass1();
        BigInterface b2 = new ConcreteClass2();*/
/*
        NotSoBigInterface2 massiv[] = {new ConcreteClass1(),  new ConcreteClass3()};

        for(int i = 0; i < massiv.length; i++) {
            massiv[i].doMethod5();
        }

        Thread thth = new Thread(new ConcreteClass1());
        Thread thth2 = new Thread(new ConcreteClass1());
        thth.start();
        thth2.start();
        thth.join();
        thth2.join();*/

        // b1.doMethod4();
        // b2.doMethod4();

        MyPrototype proto = new MyPrototype();
        System.out.println(proto);

    }

}
