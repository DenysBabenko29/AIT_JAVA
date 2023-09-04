import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(multiplyArr(arr));

    }

    public static int multiplyArr(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i += 2) {
            sum *= arr[i];
        }
        return sum;
    }

}