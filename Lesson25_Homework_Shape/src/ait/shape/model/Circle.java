package ait.shape.model;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Circle " + super.toString();
    }
    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

}
