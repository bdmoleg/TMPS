public class ForSureSingleton {

    public static int counter;
    public double qq = 0.0;
    private Object ob = new Object();

    protected float flfl = 0.0f;
    public static boolean yesOrNo;

    private static ForSureSingleton instance = null;

    private ForSureSingleton() {
        yesOrNo = true;
        counter++;
    }

/*    public static ForSureSingleton getMySureSingleInstance() {

        return instance;

    }*/

    public static ForSureSingleton getMySureSingleInstance() {

        if(instance == null) {
            synchronized (ForSureSingleton.class) {
                if(instance == null) {
                    instance = new ForSureSingleton();
                }
            }
        }

        return instance;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int a) {
        counter = a;
    }

}

// Lazy Singleton, Ленивый паттерн одиночка

// Eager Singleton, потоко-безопасный




// Logging, Cache, Database, Network, Object Pool(Thread Pool)