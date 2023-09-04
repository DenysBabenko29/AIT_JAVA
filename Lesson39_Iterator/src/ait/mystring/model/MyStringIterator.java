package ait.mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    private StringBuilder str;
    private int size;
    private int currentPosition;

    public MyStringIterator(StringBuilder str){
        this.str = str;
        size = str.length();
        // currentPosition = 0;
    }
    @Override
    public boolean hasNext() {
        return currentPosition < size;
    }

    @Override
    public Character next() {
        return str.charAt(currentPosition++);
    }

    public void remove(){
        str.deleteCharAt(--currentPosition);
        size--;
    }
}
