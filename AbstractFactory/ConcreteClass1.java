public class ConcreteClass1 implements NotSoBigInterface1, NotSoBigInterface2, Runnable{
    @Override
    public void doMethod1() {
        System.out.println("ConcreteClass1 Method 1");
    }


    @Override
    public void doMethod2() {
        System.out.println("ConcreteClass1 Method 2");
    }

    @Override
    public void doMethod3() {
        System.out.println("ConcreteClass1 Method 3");
    }

    @Override
    public void doMethod4() {
        System.out.println("ConcreteClass1 Method 4");
    }

    @Override
    public void doMethod5() {
        System.out.println("ConcreteClass1 Method 5");
    }

    @Override
    public void doMethod6() {
        System.out.println("ConcreteClass1 Method 6");
    }

    @Override
    public void doMethod7() {
        System.out.println("ConcreteClass1 Method 7");
    }

    @Override
    public void doMethod8() {
        System.out.println("ConcreteClass1 Method 8");
    }

    @Override
    public void doMethod9() {
        System.out.println("ConcreteClass1 Method 9");
    }

    @Override
    public void doMethod10() {
        System.out.println("ConcreteClass1 Method 10");
    }

    @Override
    public void doMethod11() {
        System.out.println("ConcreteClass1 Method 11");
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
