import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        int randomIndex = random.nextInt(100);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            arr.add(i);
        }
        arr.add(randomIndex, randomNum);
        System.out.println(arr);
        System.out.println(findDuplicate(arr));
        System.out.println(findX(arr));

    }

    public static int findDuplicate(ArrayList<Integer> arr){
        int x = 0;
        for (Integer i : arr){
            if (i != x){
                return i;
            }
            x++;
        }
        return -1;
    }

    public static int findX(ArrayList<Integer> arr){
        int sum = (100 + 1) * (100 / 2);
        int res = 0;
        for (Integer integer : arr){
            res += integer;
        }
        return res - sum;
    }
}
