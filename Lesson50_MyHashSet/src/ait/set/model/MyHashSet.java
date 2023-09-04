package ait.set.model;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet<E> implements ISet<E>{
    private LinkedList<E>[] hashSet;
    private int size;
    private int capacity;
    private double loadFactor;

    public MyHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashSet = new LinkedList[capacity];
    }

    public MyHashSet(int capacity) {
        this(capacity, 0.75);
    }

    public MyHashSet() {
       // this(16, 0.75);
        this(16);
    }


    //O(1) когда размер со временем станет нужного размера
    @Override
    public boolean add(E element) {
        if (size >= capacity * loadFactor){
            rebuildArray();
        }
        int index = getIndex(element);
        if (hashSet[index] == null){
            hashSet[index] = new LinkedList<>();
        }
        if (hashSet[index].contains(element)){
            return false;
        }
        hashSet[index].add(element);
        size++;
        return true;
    }

    private void rebuildArray() {
        capacity = capacity * 2;
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        for (int i = 0; i < hashSet.length; i++) {
            if (hashSet[i] != null){
                for (E e : hashSet[i]){
                    int index = getIndex(e);
                    if (newHashSet[index] == null){
                        newHashSet[index] = new LinkedList<>();
                    }
                    newHashSet[index].add(e);
                }
            }
        }
        hashSet = newHashSet;
    }

    private int getIndex(E element) {
        int hashCode = element.hashCode();
        hashCode = hashCode >= 0 ? hashCode : -hashCode;
        return hashCode % capacity;
    }

    //O(1)
    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if (hashSet[index] == null){
            return false;
        }
        hashSet[index].contains(element);
        return true;
    }

    @Override
    public boolean remove(E element) {
        int index = getIndex(element);
        if (hashSet [index] == null){
            return false;
        }
        boolean res = hashSet[index].remove(element);
        if (res){
            size--;
        }
        return true;
    }

    // O(n)
    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i;
            int j;
            int totalCounter;
            @Override
            public boolean hasNext() {
                return totalCounter < size;
            }

            @Override
            public E next() {
                while (hashSet[i] == null || hashSet[i].isEmpty()){
                    i++;
                }
                E res = hashSet[i].get(j);
                totalCounter++;
                if (j < hashSet[i].size() - 1){
                    j++;
                } else {
                    j = 0;
                    i++;
                }
                return res;
            }
        };
    }
}
