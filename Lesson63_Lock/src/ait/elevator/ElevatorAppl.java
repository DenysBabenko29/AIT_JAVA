package ait.elevator;

import ait.elevator.model.Elevator;
import ait.elevator.task.Truck;

public class ElevatorAppl {
    private static final int N_TRUCKS = 1000;
    private static final int N_RACES = 10;
    private static final int CAPACITY = 20;

    public static void main(String[] args) throws InterruptedException {
        Elevator lenin = new Elevator("V. I. Lenin");

        Truck[] trucks = new Truck[N_TRUCKS];
        for (int i = 0; i < trucks.length; i++) {
            trucks[i] = new Truck(N_RACES, CAPACITY, lenin);
        }

        Thread[] threads = new Thread[N_TRUCKS];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(trucks[i]);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println(lenin);
    }
}
