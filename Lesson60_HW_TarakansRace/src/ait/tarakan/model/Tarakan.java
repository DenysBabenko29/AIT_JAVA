package ait.tarakan.model;

import java.util.Random;

public class Tarakan implements Runnable{
    public static String winner = null;
    static int distance;
    String name;

    Random random = new Random();

    public Tarakan(String name) {
        this.name = name;
    }

    public void setWinner(String winner) {
        if (this.winner == null){
            this.winner = winner;
        }
    }

    public static void setDistance(int distance) {
        Tarakan.distance = distance;
    }

    @Override
    public void run() {
        for (int i = 0; i < distance; i++) {
            System.out.println(name);
            int randNum = random.nextInt(5 - 2) + 2;
            try {
                Thread.sleep(randNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setWinner(name);
    }
}
