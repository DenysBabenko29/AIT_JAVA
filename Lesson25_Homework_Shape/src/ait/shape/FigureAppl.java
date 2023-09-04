package ait.shape;

import ait.shape.model.Circle;
import ait.shape.model.Shape;
import ait.shape.model.Square;
import ait.shape.model.Triangle;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2);
        shapes[1] = new Circle(7);
        shapes[2] = new Triangle(6);
        shapes[3] = new Square(3);

        System.out.println("Total area = " + totalArea(shapes));
        System.out.println("Total perimetr = " + totalPerimetr(shapes));
        System.out.println("Total area of circle = " + totalAreaCircle(shapes));
    }

    public static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape x : shapes)
            sum += x.calcArea();
        return sum;
    }

    public static double totalPerimetr(Shape[] shapes) {
        double sum = 0;
        for (Shape x : shapes)
            sum += x.calcPerimeter();
        return sum;
    }

    public static double totalAreaCircle(Shape[] shapes) {
        double sum = 0;
        for (Shape x : shapes) {
            if (x instanceof Circle) {
                sum += x.calcArea();
            }
        }
        return sum;
    }
}
