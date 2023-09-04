package ait.cars.dao;

import ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {

    Car[] cars;
    int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car victim = cars[i];
                cars[i] = cars[--size];
                cars[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarByModel(String model) {
        return findCarByPredicate(e -> e.getModel().equals(model));
    }

    @Override
    public Car[] findCarByCompany(String company) {
        return findCarByPredicate(e -> e.getCompany().equals(company));
    }

    @Override
    public Car[] findCarByEngine(double min, double max) {
        return findCarByPredicate(e -> e.getEngine() >= min && e.getEngine() < max);
    }

    @Override
    public Car[] findCarByColor(String color) {
        return findCarByPredicate(e -> e.getColor().equals(color));
    }

    @Override
    public int quantity() {
        return size;
    }
    private Car[] findCarByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])){
                count++;
            }
        }
        Car[] newArrCars = new Car[count];
        for (int i = 0, j = 0; j < newArrCars.length; i++) {
            if (predicate.test(cars[i])){
                newArrCars[j++] = cars[i];
            }
        }
        return newArrCars;
    }
}
