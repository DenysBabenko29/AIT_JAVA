import java.util.Scanner;

public class Task_8 {
    //Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        System.out.println("Введите строку или число: ");
        String str = scanner.nextLine();
        builder.append(str);
        if (str.equalsIgnoreCase(builder.reverse().toString())){
            System.out.println("Введенное значение является палиндромом");
        } else {
            System.out.println("Введенное значение не является палиндромом");
        }
    }
}
