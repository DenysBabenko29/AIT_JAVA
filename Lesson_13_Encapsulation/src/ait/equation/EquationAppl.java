package ait.equation;
import ait.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(1, 2, 2);
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(4, 6, -4);
        double result = quadraticEquation1.delta();
        quadraticEquation1.display();
        System.out.println(result);
        System.out.println(quadraticEquation1.quantityRoots(result));

        result = quadraticEquation2.delta();
        quadraticEquation2.display();
        System.out.println(result);
        System.out.println(quadraticEquation2.quantityRoots(result));
    }
}
