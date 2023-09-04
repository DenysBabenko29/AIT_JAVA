package ait.volatiles;

import ait.volatiles.task.InfinityLoop;

public class InfinityLoopAppl {
    public static void main(String[] args) throws InterruptedException {
        InfinityLoop task = new InfinityLoop();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(3000);
        task.setFlag(false);
    }
}
