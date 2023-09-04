package ait.wardrobe.test;

import ait.wardrobe.model.Wardrobe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class WardrobeTest {
    private static final int MAX = 5;
    private static Random random = new Random();
    private static final int SIZE = 10;
    Wardrobe[] wardrobes;

    @BeforeEach
    void setUp() {
        wardrobes = getWardrobes();
    }

    private Wardrobe[] getWardrobes() {
        Wardrobe[] res = new Wardrobe[SIZE];
        for (int i = 0; i < res.length; i++) {
            double height = 1 + random.nextInt(MAX);
            double width = 1 + random.nextInt(MAX);
            double depth = 1 + random.nextInt(MAX);
            res[i] = new Wardrobe(height, width, depth);
        }
        return res;
    }

    private void printArray(Wardrobe[] arr, String title) {
        System.out.println("==== " + title + " ====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
/*
    @Test
    void testComparaleWardrobe() {
        printArray(wardrobes, "Test Comparable before sort");
        Arrays.sort(wardrobes);
        printArray(wardrobes, "Test Comparable after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 2));
        System.out.println("index = " + index);

    }

    @Test
    void testAreaComparatorWardrobe(){
        printArray(wardrobes, "Test Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.area(), w2.area());
        Arrays.sort(wardrobes, comparator);
        printArray(wardrobes, "Test Comparator after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 10), comparator);
        System.out.println("index = " + index);
    }



    @Test
    void testVolumeComparatorWardrobe(){
        printArray(wardrobes, "Test Volume Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.volume(), w2.volume());
        Arrays.sort(wardrobes, comparator);
        printArray(wardrobes, "Test Volume Comparator after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 1), comparator);
        System.out.println("index = " + index);
    }

 */
    @Test
    void testHeightVolumeComparatorWardrobe(){
        printArray(wardrobes, "Test Heigth Volume Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> {
            int res = Double.compare(w1.getHeight(), w2.getHeight());
            return res != 0 ? res : Double.compare(w1.volume(), w2.volume());
        };
        Arrays.sort(wardrobes, comparator);
        printArray(wardrobes, "Test Heigth Volume Comparator after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 1), comparator);
        System.out.println("index = " + index);
    }
    @Test
    void testIntegerDesc(){
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        Arrays.sort(actual, (a, b) -> Integer.compare(b, a));
        assertArrayEquals(expected, actual);
    }

}