package ait.multitherading;

import ait.multitherading.task.MyTAskExtends;
import ait.multitherading.task.MyTaskImpl;

public class MultiTheradingAppl {
    private static final int MAX = 10;
    private static final int SIZE = 3;

    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyTaskImpl task1 = new MyTaskImpl("TaskImplements", MAX);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new MyTAskExtends("TaskExtends", MAX);
        MyTaskImpl[] tasks = new MyTaskImpl[SIZE];
        for (int i = 0; i < tasks.length; i++) {
tasks[i] = new MyTaskImpl("Name#" + i, MAX);
        }
        Thread[] threads = new Thread[tasks.length];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        thread1.start();
        thread2.start();
        for (int i = 0; i < MAX; i++) {
            System.out.println("Main thread, count " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main thread stopped");
     }
}
