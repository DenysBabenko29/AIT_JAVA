package ait.elevator.task;

import ait.elevator.model.Elevator;

public class Truck implements Runnable{
    static Object monitor = new Object();
    static Object monitor2 = new Object();
    int nRaces;
    int capacity;
    int halfCapacity;
    Elevator elevator;
    Elevator elevator2;

    public Truck(int nRaces, int capacity, Elevator elevator, Elevator elevator2) {
        this.nRaces = nRaces;
        this.capacity = capacity;
        this.elevator = elevator;
        this.elevator2 = elevator2;
        this.halfCapacity = capacity / 2;
    }

    @Override
    public void run() {
        for (int i = 0; i < nRaces; i++) {
            if (i % 2 == 0){
                synchronized (monitor) {
                    elevator.add(halfCapacity);
                }
                    synchronized (monitor2){
                        elevator2.add(halfCapacity);
                }
            } else {
                synchronized (monitor2){
                    elevator2.add(halfCapacity);
                }
                synchronized (monitor){
                    elevator.add(halfCapacity);
                }
            }

        }
    }
}
