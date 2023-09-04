package ait.entitycollection.dao;

import ait.entitycollection.interfaces.Entity;
import ait.entitycollection.interfaces.EntityCollection;

import java.util.ArrayList;
import java.util.List;

public class A implements EntityCollection {
    private List<Entity> list;
    private int maxValue = Integer.MIN_VALUE;
    private int index;

    public A() {
        list = new ArrayList<>();
    }

    //O(1)
    @Override
    public void add(Entity entity) {
        if (entity == null){
            return;
        }
        list.add(entity);
        if (this.maxValue < entity.getValue()){
            this.maxValue = entity.getValue();
            index = list.size() - 1;
        }
    }

    //O(n)
    @Override
    public Entity removeMaxValue() {
        if (list.size() == 0){
            return null;
        }
        Entity victim = list.get(index);
        list.remove(index);
        maxValue = list.get(0).getValue();
        for (Entity e : list){
            if (maxValue < e.getValue()){
                maxValue = e.getValue();
            }
        }
        return victim;
    }
}