package ait.time.test;

import ait.time.utils.DateOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAge() {
        assertEquals(62, DateOperations.getAge("12/04/1961"));
        assertEquals(61, DateOperations.getAge("1961-12-25"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};
        String[] actual = DateOperations.sortStringDates(dates);
        assertArrayEquals(expected, actual);
    }
}