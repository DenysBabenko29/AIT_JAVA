import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_10 {
    //Напишите Java-программу для обхода ArrayList с
    // использованием цикла for, while и улучшенного цикла for.

    public static void main(String[] args) {
        ArrayList testList = new ArrayList();
        testList.add("50");
        testList.add("60");
        testList.add("70");

        System.out.println("\tWhile");
        Iterator iter = testList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("\t Улучшеный цикл For");
        testList.stream().forEach(System.out::println);

        System.out.println("\tFor");
        for (int i = 0; i < testList.size(); i++) {
            System.out.println(testList.get(i));
        }
    }
}
