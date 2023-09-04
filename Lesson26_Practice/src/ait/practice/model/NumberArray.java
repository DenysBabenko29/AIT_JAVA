package ait.practice.model;

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (10 - (-10) + 1) + (-10));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Summa = " + sumElOddInt(arr));
    }
    public static int sumElOddInt(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
