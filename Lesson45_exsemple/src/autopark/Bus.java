package autopark;

import java.rmi.ServerError;
import java.util.ArrayList;

public class Bus {
    private static final int PASSENGER_MAX_COUNT = 5;

    private Driver driver;
    private ArrayList<Passenger> passengers;
    private String number;
    private boolean isGoing;

    public Bus(String number) {
        this.setNumber(number);
        this.passengers = new ArrayList<>();
    }

    void addPassenger(Passenger passenger) {
        if (passenger == null) {
            System.err.println("Такого пассажира не существует");
            return;
        }
        if (isGoing) {
            System.err.println("Автобус уже едет");
            return;
        }
        if (!isFull()) {
            System.out.println("В автобус прибыл новый пассажир " + passenger.getName());
            passengers.add(passenger);
        }
}

    void setDriver(Driver driver) {
        if (this.isGoing) {
            System.err.println("На ходу водителя не меняют");
            return;
        }
        if (driver != null) {
            if (this.driver != null) {
                System.out.println("Освобождаем " + this.driver.getName());
                this.driver.free();
            }
            System.out.println("Водителем автобуса <" + this.number + "> стал " + driver.getName());
            this.driver = driver;
        } else {
            System.err.println("Нельзя положить null-водителя");
        }
    }

    public void setNumber(String number) {
        if (number != null && !number.equals("")) {
            this.number = number;
        } else {
            this.number = "DEFAULT";
        }
    }

    public String getNumber() {
        return number;
    }

    void go() {
        if (this.isGoing) {
            System.err.println("Автобус уже едет");
            return;
        }
        if (this.driver != null) {
            System.out.println("Автобус <" + this.number + "> под управлением " + this.driver.getName() + " поехал");
            this.isGoing = true;
        } else {
            System.err.println("У автобуса нет водителя");
        }
    }

    void stop() {
        if (this.isGoing) {
            System.out.println("Автобус <" + this.number + "> остановился");
            this.isGoing = false;
        }
    }

    public boolean isGoing() {
        return isGoing;
    }
    boolean isFull(){
        return PASSENGER_MAX_COUNT >= passengers.size();
    }

}
