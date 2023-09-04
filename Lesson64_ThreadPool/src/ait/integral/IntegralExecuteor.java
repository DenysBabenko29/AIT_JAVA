package ait.integral;

import ait.integral.task.SumRectangles;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class IntegralExecuteor {
    private static final int N_TASK = 1000;
    private static final double A = 0;
    private static final double B = 3;
    private static final int N_PARTS = 100_000;

    public static void main(String[] args) throws InterruptedException {
        SumRectangles[] task = new SumRectangles[N_TASK];
        for (int i = 0; i < task.length; i++) {
            task[i] = new SumRectangles(A, B, x -> x * x, N_PARTS, N_TASK, i);
        }
        long t1 = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < task.length; i++) {
            executorService.execute(task[i]);
        }
        executorService.shutdown();
        executorService.awaitTermination(3, TimeUnit.MINUTES);
        
        long t2 = System.currentTimeMillis();
        System.out.println("Durations = " + (t2 - t1));
        double res = Arrays.stream(task).mapToDouble(t -> t.getResult()).sum();
        System.out.println(res);
    }
}
