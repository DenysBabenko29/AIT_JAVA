package ait.shape.model;

public class Triangle extends Shape{

    public Triangle(double side) {
        super(side);
    }
    @Override
    public String toString() {
        return "Triangle " + super.toString();
    }
    @Override
    public double calcArea() {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }
    @Override
    public double calcPerimeter() {
        return side * 3;
    }
}
