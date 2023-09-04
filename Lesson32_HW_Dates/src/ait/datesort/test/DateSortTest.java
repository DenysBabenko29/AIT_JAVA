package ait.datesort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class DateSortTest {

    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = (s1, s2) -> {
            String[] str1 = s1.split("-");
            String[] str2 = s2.split("-");
            int res = Integer.compare(Integer.parseInt(str1[2]), Integer.parseInt(str2[2]));
            return res != 0 ? res : Integer.parseInt(str1[1]) > Integer.parseInt(str2[1]) ?
                    1 :
                    Integer.parseInt(str1[1]) == Integer.parseInt(str2[1]) ?
                    Integer.compare(Integer.parseInt(str1[0]), Integer.parseInt(str2[0])) : -1;
        };
    }

        @Test
        void testDateSort () {
            String[] dates = {
                    "07-05-1990",
                    "28-01-2010",
                    "11-08-1990",
                    "15-01-2010",
                    "16-06-1970"
            };
            Arrays.sort(dates, dateComparator);
            String[] expected = {
                    "16-06-1970",
                    "07-05-1990",
                    "11-08-1990",
                    "15-01-2010",
                    "28-01-2010"
            };
            assertArrayEquals(expected, dates);
        }
    }