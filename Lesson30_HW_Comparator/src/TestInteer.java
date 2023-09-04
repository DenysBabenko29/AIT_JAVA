import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestInteer {
    Integer[] arr;

    @BeforeEach
    void setup() {
        arr = new Integer[]{4, 3, 2, 7, 12, 65, 4, 8, 9, 0};
    }

    @Test
    void testSortInteger() {
        Arrays.sort(arr, (s1, s2) -> {
            if (s1 % 2 == 0 && s2 % 2 != 0) {
                return -1;
            } else if (s1 % 2 != 0 && s2 % 2 == 0) {
                return 1;
            } else if (s1 % 2 == 0 && s2 % 2 == 0) {
               return s1 - s2;
            }
            return s2 - s1;
        });
        System.out.println(Arrays.toString(arr));
    }
}
