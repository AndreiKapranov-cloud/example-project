package by.example.lecture16.sync;

public class Counter {

    private final Object lock = new Object();

    private int count = 0;

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

}
