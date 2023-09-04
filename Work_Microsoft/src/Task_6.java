import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_6 {
    //Напишите Java-программу для итерации объекта типа
    // HashMap с использованием цикла while и улучшенного цикла for.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Denys");
        map.put(2, "Karyna");
        map.put(3, "Kristina");

        System.out.println("Цикл While:");

        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry qurentMe = (Map.Entry) iter.next();
            System.out.println("Ключ это " + qurentMe.getKey() + " Значение это " + qurentMe.getValue());

        }

        for (Map.Entry i : map.entrySet()) {
            System.out.println(i);
        }

        map.entrySet().stream().forEach(System.out::println);
    }
}
