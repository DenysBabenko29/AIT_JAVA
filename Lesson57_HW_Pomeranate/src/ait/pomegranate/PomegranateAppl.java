package ait.pomegranate;

import ait.pomegranate.model.Box;
import ait.pomegranate.model.Pomegranate;
import ait.pomegranate.model.Seed;

import java.util.*;
import java.util.stream.Stream;

public class PomegranateAppl {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>(listBoxes());
        long maxSeeds = boxes.stream()
                .map(Box::countSeedsInBox)
                .reduce(0L, (sum, x) -> sum += x);

        System.out.println("===============");
        Box box = new Box("name", listPomegranates());
        long maxSeedsInOneBox = box.countSeedsInBox();
        System.out.println(maxSeedsInOneBox);

        System.out.println("===============");
        Map<String, Long> map = new HashMap<>();
        map.
    }

    public static List<Seed> listSeeds(){
        List<Seed> seeds = new ArrayList<>();
        int n = random.nextInt(700 - 400 + 1) + 400;
        for (int i = 0; i < n; i++) {
            seeds.add(new Seed());
        }
        return seeds;
    }

    public static List<Pomegranate> listPomegranates(){
        List<Pomegranate> list = new ArrayList<>();
        int n = random.nextInt(20 - 10 + 1) + 10;
        for (int i = 0; i < n; i++) {
            list.add(new Pomegranate(listSeeds()));
        }
        return list;
    }

    public static List<Box> listBoxes(){
        List<Box> boxes = new ArrayList<>();
        int n = random.nextInt(200 - 100 + 1) + 100;
        for (int i = 0; i < n; i++) {
            boxes.add(new Box("name" + i, listPomegranates()));
        }
        return boxes;
    }
}
