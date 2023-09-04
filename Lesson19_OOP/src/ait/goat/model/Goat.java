package ait.goat.model;

public class Goat {
    private int count;
    private final int MAX;
    public Goat(int max){
        this.MAX = max;
    }

    public int getMAX() {
        return MAX;
    }

    public void inkrementCount(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
