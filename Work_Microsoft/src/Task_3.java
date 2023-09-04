import com.sun.tools.javac.Main;

public class Task_3 {
    //Напишите программу на Java для того,
    // чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int t = b;
        b = a;
        a = t;
        System.out.println("a = " + a + ", b = " + b);
    }
}
