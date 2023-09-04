package ait.list.model;

import ait.list.interfaces.IList;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<E> implements IList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    // o(1)
    @Override
    public int size() {
        return this.size;
    }

    //O(1)
    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    //O(1)
    @Override
    public boolean add(E element) {
        Node<E> newNode = new Node<>(last, element, null);
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
        return true;
    }

    // O(n), O(1) for last
    @Override
    public boolean add(int index, E element) {
        if (index == size) {
            return add(element);
        }
        Node<E> node = getNodeByIndex(index);
        Node<E> newNode = new Node<>(node.prev, element, node);
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode;
        }
        size++;
        return true;
    }

    // O(n)
    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.data;
    }

    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(index);
    }

    //O(n)
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.data) {
                    return index;
                }
            }
        }
        return -1;
    }

    //O(n)
    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        if (o != null) {
            for (Node<E> node = last; node != null; node = node.prev, index--) {
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = last; node != null; node = node.prev, index--) {
                if (o == node.data) {
                    return index;
                }
            }
        }
        return 0;
    }


    //O(1)
    @Override
    public E remove(int index) {
        checkIndex(index);

        Node<E> element = getNodeByIndex(index);
        E viktim = element.data;

        if (element.prev == null) {
            first = element.next;
        } else {
            element.prev.next = element.next;
        }
        if (element.next == null) {
            last = element.prev;
        } else {
            element.next.prev = element.prev;
        }
        size--;
        return viktim;
    }

    //O(n)
    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> node = getNodeByIndex(index);
        E viktim = node.data;
        node.data = element;
        return viktim;
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node<E> node = first;
            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                E data = node.data;
                node = node.next;
                return data;
            }
        };
    }

    private static class Node<E>{
        Node<E> prev;
        E data;
        Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}
