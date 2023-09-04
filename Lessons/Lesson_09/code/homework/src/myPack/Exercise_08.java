package myPack;

import java.util.Arrays;
import java.util.Random;

public class Exercise_08 {
    public static void main(String[] args) {
        //Имеется массив данных - остатки на счетах клиентов банка (задать случайными
        // числами в интервале от 10 000 до 100 000000 д.е.,
        // количество клиентских счетов = 20). Произошла деноминация, теперь 1 д.е = 100 старых д.е.
        // Рассчитайте новые остатки денег на счетах клиентов.

        int[] arr = new int[20];
        double[] arrDenom = new double[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (10000000 - 10000 + 1) + 10000);
            arrDenom[i] = arr[i] * 1. / 100 ;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrDenom));
    }
}
