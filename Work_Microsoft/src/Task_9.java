import java.util.Scanner;

public class Task_9 {
    //Написать программу на Java для вычисления серии чисел Фибоначчи.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int t = 1;
        System.out.println("Введите колличество значений");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            num1 = num2;
            num2 = t;
            t = num1 + num2;
            System.out.print(num1 + ",");
        }
    }
}
