package myPack;

import java.util.Random;

public class ArrRandom {



    public int[] arrayRandom(int n, int min, int max) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max) + min;
        }
        return arr;
    }

}
