package by.example.lecture15;

public class ThreadWithName extends Thread {

    private static int count = 0;

    public ThreadWithName(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println("thread with name " + getName() + ", count: " + count);
    }

    public static int getCount() {
        return count;
    }

}
