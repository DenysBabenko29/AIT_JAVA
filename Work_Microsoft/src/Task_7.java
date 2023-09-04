public class Task_7 {

    //Напишите программу на Java, чтобы узнать, является ли число простым или нет.
    public static void main(String[] args) {
        int num = 54;
        boolean flag = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Число " + num +  " простое");
        } else {
            System.out.println("Число " + num +  " не простое");
        }

    }
}
