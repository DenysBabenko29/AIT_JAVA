package ait.shape.model;

public class Square extends Shape{

    public Square(double side) {
        super(side);
    }
    @Override
    public String toString() {
        return "Square " + super.toString();
    }
    @Override
    public double calcArea() {
        return Math.pow(side, 2);
    }
    @Override
    public double calcPerimeter() {
        return side * 4;
    }

}
