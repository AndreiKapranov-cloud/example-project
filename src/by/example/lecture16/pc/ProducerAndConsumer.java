package by.example.lecture16.pc;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {

    private List<Product> products = new ArrayList<>();
    private final Integer expectedTotalCount = 10;

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (products.size() == expectedTotalCount) {
                    wait();
                }
                Product product = new Product();
                System.out.println("Product was produced: " + product);
                products.add(product);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (true) {
                if (products.size() == 0) {
                    wait();
                }
                Product product = products.remove(0);
                System.out.println("Product was consumed: " + product);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
