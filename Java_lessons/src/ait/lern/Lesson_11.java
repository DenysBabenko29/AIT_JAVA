package ait.lern;

public class Lesson_11 {


    public static void bubleSort(int[] arr){
        boolean stop = true;
        while(stop){
            stop = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    stop = true;
                }
            }
        }
    }


    public static int[] selectionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int t = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]){
                        min = arr[j];
                        t = j;
                }
            }
            arr[t] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    public static int[] happyDumpling(int value) {
        int[] arr = new int[value];
        int rand = (int) (Math.random() * (30 + 1 - 1) + 1);
        for (int i = 0; i < arr.length; i++) {
            if (i == rand) {
                arr[i] = 30;
            } else {
                arr[i] = 15;
            }
        }
        return arr;
    }

    public static int searchHappyDumpling(int[] arr) {
        int happyDumpling = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > happyDumpling) {
                happyDumpling = arr[i];
                index = i;
            }
        }
        return index;
    }

    public Result binarySeach(int[] arr, int element) {
        int indexOfElement = -1, temp = 0, left = 0, right = arr.length - 1, middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            temp = arr[middle];
            if (element == temp) {
                break;
            } else if (element > temp) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if (element != temp) {
            temp = -1;
            middle = -1;
            return new Result(temp, middle);
        }
        return new Result(temp, middle);
    }

    public class Result {
        int temp, middle;

        public Result(int temp, int middle) {
            this.temp = temp;
            this.middle = middle;
        }
    }
    public static int[] randomArr(int n, int min, int max){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
}
