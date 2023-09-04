import java.util.HashMap;
import java.util.Scanner;

public class Task_15 {
    //Напишите программу на Java, чтобы найти повторяющиеся символы в строке.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("Введите строку: ");
        String str = scanner.nextLine().toLowerCase();
        for (Character character : str.toCharArray()){
            if (character == ' '){
                continue;
            }
            if (map.containsKey(character)){
                int count = map.get(character);
                map.put(character, count + 1);
            } else {
                map.put(character, 1);
            }
        }
        map.entrySet().stream().filter(x -> x.getValue() > 1).forEach(System.out::println);
    }
}
