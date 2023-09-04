package ait.practice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySumTest {
    NumberArray sumArr;

    @BeforeEach
    void setUp() {
        sumArr = new NumberArray();
    }

    @Test
    void testSumElOddInt(){
        int[] arr = {10, 20, -30, 40};
        NumberArray.sumElOddInt(arr);
        assertEquals(60, NumberArray.sumElOddInt(arr));
    }
}
