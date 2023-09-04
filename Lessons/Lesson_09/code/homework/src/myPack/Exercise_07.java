package myPack;

import java.util.Arrays;

public class Exercise_07 {
    public static void main(String[] args) {
        //Задан массив целых чисел: 46, 13, 1, 10, 67, -4, 20, 56, 11, 35. Выполнить сортировку массива от меньшего к большему.
        int[] arr = {46, 13, 1, 10, 67, -4, 20, 56, 11, 35};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
