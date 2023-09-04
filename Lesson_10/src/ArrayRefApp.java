public class ArrayRefApp {
    public static void main(String[] args) {

       int x = 10;
       pow2(x);
       int[] arr = {1, 2, 3};
       int[] arr2 = arr;
        System.out.println(arr);
        System.out.println(arr2);
        boolean y = arr == arr2;
        System.out.println(y);

    }
    public static void pow2(int x){
        x = x * x;
        System.out.println(x);
    }
}