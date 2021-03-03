package by.example.lecture17.parking;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static final Parking PARKING = new Parking();

    private static final Random RANDOM = new Random();
    public static final int CAR_COUNT = 10;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(CAR_COUNT);

        for (int i = 0; i < CAR_COUNT; i++) {
            Car car = new Car("#" + i, RANDOM.nextInt(1000), RANDOM.nextInt(1000));
            executor.submit(new ParkingThread(car));
        }

        executor.shutdown();

    }

}
