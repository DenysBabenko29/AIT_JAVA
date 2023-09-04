import java.util.HashMap;

public class Task_5 {
        //Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.
        public static void main(String[] args) {
            String str = "Current task posted for Java developers developers";
            System.out.println(quantityWord(str));

        }

    public static HashMap<String, Integer> quantityWord(String str){
        String[] arr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }
}
