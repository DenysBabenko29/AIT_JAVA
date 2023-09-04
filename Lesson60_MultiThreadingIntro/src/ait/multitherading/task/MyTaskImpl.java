package ait.multitherading.task;

public class MyTaskImpl implements Runnable{
    String name;
    int max;

    public MyTaskImpl(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + " task started");
        for (int i = 0; i < max; i++) {
            System.out.println("Task " + name + ", count = " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " task stopped");
    }
}
