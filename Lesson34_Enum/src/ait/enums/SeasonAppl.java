package ait.enums;

import ait.enums.model.Season;

import java.util.Arrays;

public class SeasonAppl {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println("=== values ===");
        System.out.println();
        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));
        System.out.println();
        System.out.println("=== ordinal ===");
        System.out.println(season.ordinal());
    }
}
