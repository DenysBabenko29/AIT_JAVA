package ait.calculator;

import java.util.Scanner;

public class CalculatorAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double y = scanner.nextDouble();
        System.out.print("Enter the oper (+, -, *, /) ");
        scanner.nextLine();
        String oper = scanner.nextLine();
        System.out.println("Result = " + calculator(x, y, oper));
    }

    public static double calculator(double x, double y, String oper) {

        double result = 0;
        switch (oper) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Error, division by zero");
                    break;
                } else {
                    result = x / y;
                    break;
                }
        }
        return result;
    }
}