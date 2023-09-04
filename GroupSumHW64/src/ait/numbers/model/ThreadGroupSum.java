package ait.numbers.model;

import ait.numbers.task.OneGroupSum;

import java.util.Arrays;

public class ThreadGroupSum extends GroupSum {
    public ThreadGroupSum(int[][] numberGroups) {
        super(numberGroups);
    }

    @Override
    public int computeSum() {
        // TODO Homework
        Thread[] threads = new Thread[numberGroups.length];
        OneGroupSum[] oneGroupSums = new OneGroupSum[numberGroups.length];
        for (int i = 0; i < threads.length; i++) {
            oneGroupSums[i] = new OneGroupSum(numberGroups[i]);
            threads[i] = new Thread(oneGroupSums[i]);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return Arrays.stream(oneGroupSums).mapToInt(OneGroupSum::getSum).sum();
    }
}
