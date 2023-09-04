package ait.list;

import java.util.*;

public class ListPerfomanceTestAppl {
    private static final int N_NUMBERS = 100_000;
    private static final int MIN = 10;
    private static final int MAX = 100;

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        filList(list);

        System.out.println("====== for-each ======");
        long t1 = System.currentTimeMillis();
        int sum = 0;
        for (Integer in : list){
            sum += in;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Duration = " + (t2- t1));

        System.out.println("====== iterator ======");
         t1 = System.currentTimeMillis();
         sum = 0;
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
         t2 = System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Duration = " + (t2- t1));
        
        System.out.println("====== for ======");
        t1 = System.currentTimeMillis();
        sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Duration = " + (t2- t1));

    }



    private static void filList(List<Integer> list) {
        Random random = new Random();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MAX - MIN) + MIN);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Duration of filList = " + (t2 - t1));
    }
}
