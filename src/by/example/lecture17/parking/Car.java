package by.example.lecture17.parking;

import static java.lang.Thread.sleep;

public class Car {

    private static final String CAR_IS_PARKED = "Car %s is parked for %d milliseconds.";

    private final String name;
    private final int maxWaitTime;
    private final int stayTime;

    public Car(String name, int maxWaitTime, int stayTime) {
        this.name = name;
        this.maxWaitTime = maxWaitTime;
        this.stayTime = stayTime;
    }

    public void park() {
        try {
            System.out.println(String.format(CAR_IS_PARKED, name, stayTime));
            sleep(stayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxWaitTime() {
        return maxWaitTime;
    }

    public int getStayTime() {
        return stayTime;
    }

}
