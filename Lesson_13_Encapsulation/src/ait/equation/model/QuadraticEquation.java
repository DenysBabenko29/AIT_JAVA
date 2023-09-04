package ait.equation.model;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void display(){
        System.out.println(a + " * x^2 + " + b + " * x + " + c + " = 0");
    }

    public double delta(){
        return Math.pow(b, 2) - 4 * a * c;
    }

    public int quantityRoots(double delta){
        if (delta > 0){
            return 2;
        } else if (delta == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
