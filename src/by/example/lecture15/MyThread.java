package by.example.lecture15;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My Thread is running!");
    }

}
