import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Arrays.copyOfRange(arr, 2, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
