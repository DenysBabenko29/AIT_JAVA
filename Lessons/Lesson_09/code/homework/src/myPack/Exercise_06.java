package myPack;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        // Задать массив из 10 случайных чисел в интервале от 10 до 100. Пользователь вводит интересующее его число.
        // Определить, есть ли в массиве такое число. Если есть, то указать на каком оно месте.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        numberSearch(x);
    }

    public static void numberSearch(int x) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100 - 10 + 1) + 10);
        }
        int y = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Число: " + arr[i] + ", Индекс: " + i);
                y = i;
                break;
            }
        }
        if (y == -1)
            System.out.println("Такого числа нет.");
    }
}
