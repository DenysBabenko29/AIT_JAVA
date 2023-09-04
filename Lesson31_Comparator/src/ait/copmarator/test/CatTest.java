package ait.copmarator.test;

import ait.copmarator.model.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class CatTest {
    Cat[] cats;

    @BeforeEach
    void setUp() {
        cats = new Cat[]{
                new Cat("Belka", 4, "Red", 8),
                new Cat("Strelka", 3, "White", 6),
                new Cat("Tom", 5, "Grey", 7),
                new Cat("Jerry", 6, "Braun", 4),
                new Cat("Jerry", 8, "Braun", 4)
        };
    }
    @Test
    void testCatsSort(){
        System.out.println("==== TestSort ====");
        Cat.printArray(cats);
        System.out.println("=========================");
        Arrays.sort(cats);
        Cat.printArray(cats);
        System.out.println("==========SortByName== (reverce) ========");
        Comparator<Cat>  s = (s1, s2) -> {
            if (s1.getName().equals(s2.getName())){
                return s2.getWeight() - s1.getWeight();
            }
            return s2.getName().compareTo(s1.getName());
        };
        Arrays.sort(cats, s);
        Cat.printArray(cats);
    }
}
