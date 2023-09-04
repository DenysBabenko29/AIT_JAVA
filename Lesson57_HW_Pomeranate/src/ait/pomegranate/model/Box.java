package ait.pomegranate.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Pomegranate>{
    String name;
    List<Pomegranate> granates;

    public Box(String name, List<Pomegranate> list) {
        this.name = name;
        this.granates = new ArrayList<>(list);
    }

    public String getName() {
        return name;
    }

    public long countSeedsInBox(){
        return granates.stream()
                .map(Pomegranate::countSeeds)
                .reduce(0L, (sum, g) -> sum += g);
    }

    @Override
    public Iterator<Pomegranate> iterator() {
        return null;
    }
}
