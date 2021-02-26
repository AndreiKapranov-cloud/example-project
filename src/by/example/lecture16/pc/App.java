package by.example.lecture16.pc;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ProducerAndConsumer pc = new ProducerAndConsumer();

        Runnable producingRunnable = () -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consumingRunnable = () -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread[] producingThreads = {
                new Thread(producingRunnable),
                new Thread(producingRunnable)
        };
        Thread[] consumingThreads = {
                new Thread(consumingRunnable),
                new Thread(consumingRunnable)
        };

        for (int i = 0; i < 2; i++) {
            producingThreads[i].start();
            consumingThreads[i].start();
        }

        for (int i = 0; i < 2; i++) {
            producingThreads[i].join();
            consumingThreads[i].join();
        }

    }

}
