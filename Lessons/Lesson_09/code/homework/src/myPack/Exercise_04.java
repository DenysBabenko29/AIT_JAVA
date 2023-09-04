package myPack;

public class Exercise_04 {
    public static void main(String[] args) {
        // Имеется массив целых чисел (задать самостоятельно), например,
        // оценки студента за семестр. Найти средний балл за семестр.
        int[] arr = {8, 3, 7, 9, 10, 6, 7, 7, 8, 11};
        averageGrade(arr);
    }
    public static void averageGrade(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }
}
