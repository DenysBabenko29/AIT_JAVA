import java.util.Arrays;

public class Task_ArrSumTwo {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, 3 ,4};
        System.out.println(Arrays.toString(twoSum(arr, 5)));

    }

    public static int[] twoSum(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k){
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[0];
    }
}
