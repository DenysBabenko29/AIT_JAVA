package ait.list.model;

import ait.list.interfaces.IList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyArrayList<E> implements IList<E> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        // elements = new Object[10];
        this(10); // из этого конструктора вызывается другой, перегруженный
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("IllegalCapacity  = " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }
    //O(1)
    @Override
    public int size() {
        return size;
    }

    // O(n)
    @Override
    public void clear() {
        elements = new Object[elements.length];
        size = 0;
    }

    //O(1)
    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    // O(1)
    private void ensureCapacity() {
        if (size == elements.length) {
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError();
            }
            int newCapacity = elements.length + elements.length / 2; // Обычно увеличивают в 1.5 раза
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // O(n)
    @Override
    public boolean add(int index, E element) {
        ensureCapacity();
        checkIndex(index);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
        return  true;
    }

    ////O(1)
    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
    }

    //O(n)
    @Override
    public int indexOf(Object o) {
        if (o != null){
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])){
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o == elements[i]){
                    return i;
                }
            }
        }
        return -1;
    }

    //O(n)
    @Override
    public int lastIndexOf(Object o) {
        if (o == null){
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(elements[i])){
                    return i;
                }
            }
        }
        if (o != null){
            for (int i = size - 1; i >= 0; i--) {
                if (o == elements[i]){
                    return i;
                }
            }
        }
        return -1;
    }

    //O(n)
    @Override
    public E remove(int index) {
        checkIndex(index);
        E temp = get(index);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
        return temp;
    }

    //O(1)
    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E temp = (E) elements[index];
        elements[index] = element;
        return temp;
    }

    //O(n)
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int counter;
            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return (E) elements[counter++];
            }
        };
    }

}
