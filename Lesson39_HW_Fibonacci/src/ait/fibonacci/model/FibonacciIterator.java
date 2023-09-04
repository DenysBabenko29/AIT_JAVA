package ait.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private Fibonacci fibonacci;
    int counter;
    int num1 = 1;
    int num2 = 1;
    int sum = 0;

    public FibonacciIterator(int quantity) {
        fibonacci = new Fibonacci(quantity);
    }

    @Override
    public boolean hasNext() {
        return counter < fibonacci.getQuantity();
    }

    @Override
    public Integer next() {
        if (counter++ <= 1){
            return 1;
        }
        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
        return sum;
    }
}