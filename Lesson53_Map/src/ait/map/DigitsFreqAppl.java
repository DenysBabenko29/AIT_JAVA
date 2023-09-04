package ait.map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqAppl {
    static Random random = new Random();
    public static void main(String[] args) {

        int[] freq = digitFreq(1_000_000);
        System.out.println("=========");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(i + " -> " + freq[i]);
        }
    }

    //O(n^2)
    private static int[] digitFreq(int capacity){
        int[] freq = new int[10];
        for (int i = 0; i < capacity; i++) {
            Integer rand = random.nextInt(Integer.MAX_VALUE);
            System.out.println(rand);
            for (Character c : rand.toString().toCharArray()){
                freq[c - '0']++;
            }
        }
        return freq;
    }
}