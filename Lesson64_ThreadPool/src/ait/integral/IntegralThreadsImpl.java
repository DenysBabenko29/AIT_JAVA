package ait.integral;

import ait.integral.task.SumRectangles;

import java.util.Arrays;

public class IntegralThreadsImpl {
    private static final int N_TASK = 1000;
    private static final double A = 0;
    private static final double B = 3;
    private static final int N_PARTS = 100_000;

    public static void main(String[] args) throws InterruptedException {
        SumRectangles[] task = new SumRectangles[N_TASK];
        for (int i = 0; i < task.length; i++) {
            task[i] = new SumRectangles(A, B, x -> x * x, N_PARTS, N_TASK, i);
        }
        Thread[] threads = new Thread[task.length];
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task[i]);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Durations = " + (t2 - t1));
        double res = Arrays.stream(task).mapToDouble(t -> t.getResult()).sum();
        System.out.println(res);
    }
}
