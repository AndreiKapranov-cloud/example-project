package by.example.lecture15;

public class App {

    public static final int THREAD_COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new ThreadWithName("" + i);
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].start();
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].join();
        }

        System.out.println("count = " + ThreadWithName.getCount());

    }

    private static void showRunnable() throws InterruptedException {
        System.out.println("main started");

        Thread thread = new MyThread();
        thread.start();

        thread.join(1000);

        System.out.println("after thread start");

//        thread.start(); // exception

        System.out.println("before runnable cover start");

        Runnable runnable = new MyRunnable();
        Thread runnableCover = new Thread(runnable);
        runnableCover.start();

        System.out.println("after runnable cover start");

        System.out.println("processors: " + Runtime.getRuntime().availableProcessors());
    }

    private static void showThreadBaseFunctionality() {
        Thread currentThread = Thread.currentThread();
        System.out.println("Name: " + currentThread.getName());
        System.out.println("Priority: " + currentThread.getPriority());
        System.out.println("State: " + currentThread.getState());
        System.out.println("Id: " + currentThread.getId());
        System.out.println("ThreadGroup: " + currentThread.getThreadGroup());

//        currentThread.start(); // exception

//        Thread.sleep(5000);

        int threadCount = Thread.activeCount();
        System.out.println(threadCount);
        Thread[] threads = new Thread[threadCount];

        Thread.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread);
        }

        System.out.println("Hello!");
    }

}
