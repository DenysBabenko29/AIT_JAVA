package ait.city.test;

import ait.city.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CistyTest {
    City[] cities;


    @BeforeEach
    void setUp(){
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    private void printArray(Object[]  arr, String title){
        System.out.println();
        System.out.println("======= " + title + " ======");
        for (Object o : arr){
            System.out.println(o);
        }
    }

    @Test
    void testComparable(){
        printArray(cities, "Original array");
        Arrays.sort(cities);
        printArray(cities, "Natural order");
        City pattern = new City("Dallas", 1_300_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println();
        System.out.println("index = " + index);
    }

    @Test
    void testComparator() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        printArray(cities, "SotrByName");
        City pattern = new City("Denver", 0);
        int index = Arrays.binarySearch(cities, pattern , comparator);
        System.out.println(index);
    }

    @Test
    void testArraySort(){
        City[] citisCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citisCopy, "CitiesCopy before sort of cities");
        Arrays.sort(cities);
        printArray(citisCopy, "CitiesCopy after sort of cities");
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(citisCopy, 0, cities.length, comparator);
        printArray(citisCopy, "CitiesCopySortByName");
    }

    @Test
    void testCopyCityOfRange(){
        City[] citiesOfRange = Arrays.copyOfRange(cities, 1, cities.length - 1);
        printArray(citiesOfRange, "CitiesCopyOfRange");
    }
}
