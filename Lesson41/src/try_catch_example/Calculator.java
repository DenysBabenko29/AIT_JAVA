package try_catch_example;

public class Calculator {
    public static void main(String[] args) {
        try {
            int arr [] = new int[5];
            arr[5] = 5;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("5");
        }
    }
}
