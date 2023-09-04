package ait.shape.model;

public abstract class Shape {
    protected double side;
    public Shape(double side) {
        this.side = side;
    }
    public Shape() {
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Perimetr = ");
        sb.append(calcPerimeter()).append(" , Area = ").append(calcArea());
        return sb.toString();
    }
    public abstract double calcArea();
    public abstract double calcPerimeter();
}
