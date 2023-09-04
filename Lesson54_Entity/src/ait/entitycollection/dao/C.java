package ait.entitycollection.dao;

import ait.entitycollection.interfaces.Entity;
import ait.entitycollection.interfaces.EntityCollection;

import java.util.*;

public class C implements EntityCollection {
    private List<Entity> list;
    private static final Comparator<Entity> comparator = (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue());

    public C() {
        this.list = new ArrayList<>();
    }

    //O(n)
    @Override
    public void add(Entity entity) {
        if (entity == null){
            return;
        }
        int index = Collections.binarySearch(list, entity, comparator);
        index = index >= 0 ? index : -index - 1;
        list.add(index, entity);
    }

    //O(1)
    @Override
    public Entity removeMaxValue() {
        Entity victim = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return victim;
    }
}