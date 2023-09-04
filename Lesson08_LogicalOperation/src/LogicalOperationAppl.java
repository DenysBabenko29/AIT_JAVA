public class LogicalOperationAppl {
    public static void main(String[] args) {
        System.out.println(oddProduct());
    }
    public static int oddProduct(){
        int res = 1;
        for (int i = 10; i < 100 ; i++) {
            if (i % 2 != 0 && i % 13 == 0){
                res *= i;
            }
        }
        return res;
    }
}