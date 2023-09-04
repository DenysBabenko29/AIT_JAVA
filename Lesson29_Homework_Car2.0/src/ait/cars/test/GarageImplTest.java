package ait.cars.test;

import ait.cars.dao.GarageImpl;
import ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    GarageImpl garage;
    Car[] car;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(9);
        car = new Car[8];
        car[0] = new Car("1_000_000_000", "Astra", "Opel", 1.7, "Red");
        car[1] = new Car("2_000_000_000", "Insignia", "Opel", 2.0, "Blue");
        car[2] = new Car("3_000_000_000", "5008", "Peugeot", 1.6, "Green");
        car[3] = new Car("4_000_000_000", "508", "Peugeot", 2.0, "Red");
        car[4] = new Car("5_000_000_000", "Mondeo", "Ford", 1.6, "White");
        car[5] = new Car("6_000_000_000", "Mondeo", "Ford", 2.0, "Blue");
        car[6] = new Car("7_000_000_000", "Golf", "VW", 1.9, "Green");
        car[7] = new Car("8_000_000_000", "Passat", "VW", 2.0, "White");

        for (Car x : car) {
            garage.addCar(x);
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(car[3]));
        Car car1 = new Car("9_000_000_000", "Passat", "VW", 2.0, "White");
        assertTrue(garage.addCar(car1));
        assertEquals(9, garage.quantity());
        car1 = new Car("10_000_000_000", "Passat", "VW", 2.0, "White");
        assertFalse(garage.addCar(car1));
    }

    @Test
    void removeCar() {
        assertEquals(car[4], garage.removeCar("5_000_000_000"));
        assertEquals(7, garage.quantity());
        assertNull(garage.removeCar("5_000_000_000"));
    }

    @Test
    void findCarByRegNumber() {
        assertNull(garage.findCarByRegNumber("2343654765768"));
        assertEquals(car[7], garage.findCarByRegNumber("8_000_000_000"));
    }

    @Test
    void findCarByModel() {
        assertArrayEquals(new Car[0], garage.findCarByModel("Corolla"));
        Car[] actual = garage.findCarByModel("Mondeo");
        Car[] expected = {car[4], car[5]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByCompany() {
        assertArrayEquals(new Car[0], garage.findCarByCompany("Audi"));
        Car[] actual = garage.findCarByCompany("Opel");
        Car[] expected = {car[0], car[1]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByEngine() {
        assertArrayEquals(new Car[0], garage.findCarByEngine(0, 1.2));
        Car[] actual = garage.findCarByEngine(1.6, 2.0);
        Car[] expected = {car[0], car[2], car[4], car[6]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByColor() {
        assertArrayEquals(new Car[0], garage.findCarByColor("Black"));
        Car[] actual = garage.findCarByColor("Red");
        Car[] expected = {car[0], car[3]};
        assertArrayEquals(expected, actual);
    }
    @Test
    void quantity(){
        assertEquals(8, garage.quantity());
    }
}