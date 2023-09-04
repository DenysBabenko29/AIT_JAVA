package ait.homework;

public class TypAppl {
    public static void main(String[] args) {
        if (args.length == 0) {
            printByte();
            printInt();
            printShort();
            printLong();
            printChar();
            printFloat();
            printDouble();
        }
        for (int i = 0; i < args.length; i++) {
            printType(args[i]);
        }
    }

    public static void printType(String args) {
        switch (args) {
            case "byte":
                printByte();
                break;
            case "int":
                printInt();
                break;
            case "short":
                printShort();
                break;
            case "long":
                printLong();
                break;
            case "char":
                printChar();
                break;
            case "float":
                printFloat();
                break;
            case "double":
                printDouble();
                break;
            default:
                System.out.println("Wrong type");
        }
    }

    public static void printByte() {
        System.out.println("Type byte: ");
        System.out.println("Min = " + Byte.MIN_VALUE);
        System.out.println("Max = " + Byte.MAX_VALUE);
    }

    public static void printInt() {
        System.out.println("Type int: ");
        System.out.println("Min = " + Integer.MIN_VALUE);
        System.out.println("Max = " + Integer.MAX_VALUE);
    }

    public static void printShort() {
        System.out.println("Type short: ");
        System.out.println("Min = " + Short.MIN_VALUE);
        System.out.println("Max = " + Short.MAX_VALUE);
    }

    public static void printLong() {
        System.out.println("Type long: ");
        System.out.println("Min = " + Long.MIN_VALUE);
        System.out.println("Max = " + Long.MAX_VALUE);
    }

    public static void printChar() {
        System.out.println("Type char: ");
        System.out.println("Min = " + Character.MIN_VALUE);
        System.out.println("Max = " + Character.MAX_VALUE);
    }

    public static void printFloat() {
        System.out.println("Type float: ");
        System.out.println("Min = " + Float.MIN_VALUE);
        System.out.println("Max = " + Float.MAX_VALUE);
    }

    public static void printDouble() {
        System.out.println("Type double: ");
        System.out.println("Min = " + Double.MIN_VALUE);
        System.out.println("Max = " + Double.MAX_VALUE);
    }
}
