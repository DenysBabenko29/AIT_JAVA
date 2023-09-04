package ait.fibonacci;

import ait.fibonacci.model.Fibonacci;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        //TODO print all numbers, and reduce sum
        //1,1,2,3,5,8,13,21
        //sum = 54
        int sum = 0;
        for (Integer i : fibonacci){
            System.out.print(i + ", ");
            sum += i;
        }
        System.out.println("\n" + sum);
    }
}