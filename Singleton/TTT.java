public class TTT implements Runnable{

    @Override
    public void run() {
        ForSureSingleton.getMySureSingleInstance();
    }

}