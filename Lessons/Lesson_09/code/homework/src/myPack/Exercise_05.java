package myPack;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        //Запросить длину массива целых чисел у пользователя, занести данные в массив,
        // сделать "разворот" массива (последний элемент должен стать первым и т.д.).
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int x = scan.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
        }
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);

    }
    public static void reverseArr(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
