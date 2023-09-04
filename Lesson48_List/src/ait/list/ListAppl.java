package ait.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListAppl {
    private static final int N_NUMBERS = 10;
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        filList(list);
        printLIst(list);
        list.removeIf(x -> x >= 15);
        printLIst(list);
    }

    private static void filList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MAX - MIN) + MIN);
        }
    }

    private static void printLIst(List<Integer> list) {
        for (Integer n : list){
            System.out.print(n + "\t");
        }
        System.out.println();
    }
}
