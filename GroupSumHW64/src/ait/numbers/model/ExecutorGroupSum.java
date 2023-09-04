package ait.numbers.model;

import ait.numbers.task.OneGroupSum;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorGroupSum extends GroupSum{
    public ExecutorGroupSum(int[][] numberGroups) {
        super(numberGroups);
    }

    @Override
    public int computeSum() {
        // TODO Homework
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        OneGroupSum[] groupSums = new OneGroupSum[numberGroups.length];
        for (int i = 0; i < numberGroups.length; i++) {
            groupSums[i] = new OneGroupSum(numberGroups[i]);
            executorService.execute(groupSums[i]);
        }
        executorService.shutdown();
            try {
                executorService.awaitTermination(1, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        return Arrays.stream(groupSums).mapToInt(OneGroupSum::getSum).sum();
    }
}
