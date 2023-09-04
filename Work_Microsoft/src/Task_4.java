public class Task_4 {
    public static void main(String[] args) {
        // Напишите программу на Java, чтобы поменять местами значения,
        // хранящиеся в двух переменных, без использования третьей переменной.

        int a = 3;
        int b = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена значениями без промежуточной переменной\na = "+a+"\nb = "+b);

    }
}
