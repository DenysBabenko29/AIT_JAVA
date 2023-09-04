package ait.lern;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = Lesson_11.randomArr(10, 1, 50);
        System.out.println(Arrays.toString(arr));
        Lesson_11.bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
