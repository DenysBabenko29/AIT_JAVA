package newPac;

import java.util.Scanner;
public class Nums {


    public int[] num(){
        int isToo = 0;
        int count = 0;
        for (int i = 0; i < 100; i++){
            if (i % 2 != 0){
                count++;
            }
        }
        int[] arr = new int[count];

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                isToo++;
            }else{
                arr[i - isToo] = i;
            }
        }

return arr;
    }
}
