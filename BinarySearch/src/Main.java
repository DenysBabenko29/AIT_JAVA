public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 11));

    }
    public static int binarySearch(int[] arr, int item){
        int first = 0;
        int last = arr.length - 1;
        int x = (first + last) / 2;
        while (item != arr[x]){
            if (arr[x] > item){
                last = x - 1;
            } else {
                first = x + 1;
            }
            x = (last + first) / 2;
        }
        return x;
    }
}
