package ait.pomegranate.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pomegranate implements Iterable<Seed> {
    List<Seed> seeds;

    public Pomegranate(List<Seed> seeds) {
        this.seeds = new ArrayList<>(seeds);
    }

    public long countSeeds() {
        return seeds.size();
    }

    @Override
    public Iterator<Seed> iterator() {
        return new Iterator<Seed>() {
            private int count;

            @Override
            public boolean hasNext() {
                return count < seeds.size();
            }

            @Override
            public Seed next() {
                return seeds.get(count++);
            }
        };
    }
}
