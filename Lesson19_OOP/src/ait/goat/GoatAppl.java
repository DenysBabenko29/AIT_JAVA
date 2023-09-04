package ait.goat;

import ait.goat.model.Goat;

public class GoatAppl {
    public static void main(String[] args) {
        Goat goat1 = new Goat(20);
        for (int i = 1; i <= goat1.getMAX(); i++) {
            goat1.inkrementCount();
        }
        System.out.println(goat1.getCount());
        Goat goat2 = new Goat(15);
        for (int i = 1; i <= goat2.getMAX(); i++) {
            goat2.inkrementCount();
        }

        System.out.println(goat2.getCount());
    }
}
