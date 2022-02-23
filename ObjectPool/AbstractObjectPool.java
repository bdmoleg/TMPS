import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class AbstractObjectPool<T> {

    private long expired;

    private Hashtable<T, Long> svobodno; // Hashtable ? HashMap ? Hashtable - thread-safe
    private Hashtable<T, Long> zanyato;

    // ThreadPoolExecutor (идея для 1 лабораторной паттерн Объектный Пул)

    private HashMap<T, Long> zanyato2; // non-thred-safe, синхронизацию(Semaphore, Lock, ..), Race Condition

    public AbstractObjectPool(long expired) {

        this.expired = expired; // milliseconds from expired param, 50 seconds, 1 second = 1000 milliseconds
        svobodno = new Hashtable<T, Long>();
        zanyato = new Hashtable<T, Long>();

    }

    protected abstract T createVeryResourseIntensiveObject();

    public abstract boolean isUpAndRunning(T obj);

    public abstract void destroy(T obj);

    public synchronized T acquireReusable() {

        long rightNow = System.currentTimeMillis();

        T t;

        if(svobodno.size() > 0) {

            Enumeration<T> enn = svobodno.keys();

            while (enn.hasMoreElements()) {

                t = enn.nextElement();

                if((rightNow - svobodno.get(t)) > expired) {
                    svobodno.remove(t);
                    destroy(t);
                    t = null;

                } else {
                    if(isUpAndRunning(t)) {
                        zanyato.put(t, rightNow);
                        svobodno.remove(t);
                        return t;
                    } else {
                        svobodno.remove(t);
                        destroy(t);
                        t = null;
                    }
                }
            }

        }

        t = createVeryResourseIntensiveObject();
        zanyato.put(t, rightNow);
        return t;

    }

    public synchronized void releaseReusable(T t) {
        zanyato.remove(t);
        svobodno.put(t, System.currentTimeMillis());
    }

    public long getExpired() {
        return expired;
    }

    public Hashtable<T, Long> getSvobodno() {
        return svobodno;
    }

    public Hashtable<T, Long> getZanyato() {
        return zanyato;
    }

    public HashMap<T, Long> getZanyato2() {
        return zanyato2;
    }
}
