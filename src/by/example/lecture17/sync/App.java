package by.example.lecture17.sync;

public class App {

    public static final int THREAD_COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 1000; i++) {

            int result = methodToTest();
            if (result < THREAD_COUNT) {
                System.out.println(result);
            }
        }

    }

    private static int methodToTest() throws InterruptedException {
        Counter counter = new Counter();

        Thread[] threads = new Thread[THREAD_COUNT];
        Runnable target = counter::increment;

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(target);
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].start();
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].join();
        }

        System.out.println(counter.getStr());

        return counter.getCount();
    }

}
