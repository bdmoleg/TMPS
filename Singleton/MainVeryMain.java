public class MainVeryMain {

    // MainThread

    public static void main(String[] args) throws InterruptedException {

        int numberOfThreads = 1600;

        Thread tt[] = new Thread[numberOfThreads];

        for(int i = 0; i < numberOfThreads; i++) {
            tt[i] = new Thread(new TTT());
            tt[i].start();
        }

        for(int i = 0; i < numberOfThreads; i++) {
            tt[i].join();
        }



       /* ForSureSingleton f1 = ForSureSingleton.getMySureSingleInstance();  // Куча
        ForSureSingleton f2 = ForSureSingleton.getMySureSingleInstance();
        ForSureSingleton f3 = ForSureSingleton.getMySureSingleInstance();


        System.out.println(f1);
        System.out.println(f2);*/
        //System.out.println(f3);

        System.out.println("Counter is: " + ForSureSingleton.getCounter());



    }

}