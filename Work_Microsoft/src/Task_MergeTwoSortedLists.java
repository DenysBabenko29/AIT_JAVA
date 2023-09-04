import java.util.ArrayList;

public class Task_MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println(luckyNumber(123321));
    }
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static boolean luckyNumber(int x) {
        String[] res = (x + "").split("");
        int num1 = 0;
        int num2 = 0;
        for (int index = 0; index < res.length; index++) {
            if(index < 3){
                num1 += Integer.parseInt(res[index]);
            } else {
                num2 += Integer.parseInt(res[index]);
            }
        }
        return num1 == num2;
    }
}
