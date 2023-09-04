package ait.cars.dao;

import ait.cars.model.Car;

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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (model.equals(cars[i].getModel())){
                count++;
            }
        }
        Car[] newArrCars = new Car[count];
        for (int i = 0, j = 0; j < newArrCars.length; i++) {
            if (model.equals(cars[i].getModel())){
                newArrCars[j++] = cars[i];
            }
        }
        return newArrCars;
    }

    @Override
    public Car[] findCarByCompany(String company) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (company.equals(cars[i].getCompany())){
                count++;
            }
        }
        Car[] newArrCars = new Car[count];

        for (int i = 0, j = 0; j < newArrCars.length; i++) {
            if (company.equals(cars[i].getCompany())){
                newArrCars[j++] = cars[i];
            }
        }
        return newArrCars;
    }

    @Override
    public Car[] findCarByEngine(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getEngine() >= min && cars[i].getEngine() < max){
                count++;
            }
        }
        Car[] newArrCars = new Car[count];

        for (int i = 0, j = 0; j < newArrCars.length; i++) {
            if (cars[i].getEngine() >= min && cars[i].getEngine() < max){
                newArrCars[j++] = cars[i];
            }
        }
        return newArrCars;
    }

    @Override
    public Car[] findCarByColor(String color) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (color.equals(cars[i].getColor())){
                count++;
            }
        }
        Car[] newArrCars = new Car[count];

        for (int i = 0, j = 0; j < newArrCars.length; i++) {
            if (color.equals(cars[i].getColor())){
                newArrCars[j++] = cars[i];
            }
        }
        return newArrCars;
    }

    @Override
    public int quantity() {
        return size;
    }
}
