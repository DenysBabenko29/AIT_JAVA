package ait.entitycollection.dao;

import ait.entitycollection.interfaces.Entity;
import ait.entitycollection.interfaces.EntityCollection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class B implements EntityCollection {
    private TreeSet<Entity> list;
    private static final Comparator<Entity> comparator = (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue());

    public B() {
        list = new TreeSet<>(comparator);
    }

    //O(log(n))
    @Override
    public void add(Entity entity) {
        if (entity == null){
            return;
        }
        list.add(entity);
    }

    //O(log(n))
    @Override
    public Entity removeMaxValue() {
        Entity victim = list.last();
        list.remove(list.last());
        return victim;
    }
}