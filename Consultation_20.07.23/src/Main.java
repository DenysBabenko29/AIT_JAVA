import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //на вход подаются числа от 1 до 100
        // узнать какое число встречается чаще остальных
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(arr.length - 1) + 1);
        }
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length];
        int max = 0;
        for (int i = 0; i < newArr.length; i++) {
            newArr[arr[i]]++;
        }
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[arr[i]] > max){
                max = newArr[i];
            }
        }

        System.out.println(arr[max] + " , count = " + max);

    }
}
