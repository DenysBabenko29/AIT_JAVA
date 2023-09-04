package ait.list.interfaces;

public interface IList<E> extends Iterable<E> {
    int size();

    default boolean isEmpty(){  // пустой ли массив
        return size() == 0;
    };

    void clear();

    default boolean contains(Object o){  // наличие в листе
        return indexOf(o) >= 0;
    };

    boolean add(E element);

    default boolean remove(Object o){
        int index = indexOf(o);
        if (index < 0){
            return false;
        }
        remove(index);
        return true;
    };

    boolean add(int index, E element);

    E get(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    E remove(int index);  // удаляет элемент и возвращает этот элемент

    E set(int index, E element);  // замена элемента
}
