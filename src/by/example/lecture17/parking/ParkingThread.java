package by.example.lecture17.parking;

import static by.example.lecture17.parking.App.PARKING;

public class ParkingThread extends Thread {

    private final Car car;

    public ParkingThread(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        PARKING.tryPark(car);
    }

}
