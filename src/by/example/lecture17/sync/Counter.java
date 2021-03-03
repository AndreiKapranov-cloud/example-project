package by.example.lecture17.sync;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Counter {

    private final AtomicInteger count = new AtomicInteger();
    private final AtomicReference<String> str = new AtomicReference<>("");

    public void increment() {
        count.incrementAndGet();
        str.set(str.get() + " " + count.get()); // not atomic operation
    }

    public int getCount() {
        return count.get();
    }

    public AtomicReference<String> getStr() {
        return str;
    }

}
