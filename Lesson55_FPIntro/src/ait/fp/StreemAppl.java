package ait.fp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreemAppl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 9, 2, 8, 3, 7, 4, 6, 5));
        list.stream()
                .filter(x -> x > 3)
                .peek(x -> System.out.println("peek befor sort " + x))
                .sorted()
                .forEach(System.out::println);
        System.out.println("============");
        list.forEach(System.out::println);
        System.out.println("\t============");
        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Arrays.stream(arr)
                .filter(x -> x > 2)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println("peek befor sort " + x))
                .sorted((x, y) -> Integer.compare(y, x))
                .forEach(System.out::println);

        System.out.println("===============");
        int sum = Arrays.stream(arr)
                .map(x -> x * 10)
                .reduce(0, (accumulator, x) -> accumulator += x);
        System.out.println("sum = " + sum);
        int mul = Arrays.stream(arr)
                .reduce(1, (accumulator, x) -> accumulator *= x);
        System.out.println("multiply = " + mul);
        String str = Arrays.stream(arr)
                .sorted()
                .map(x -> x.toString())
                .reduce("Result = ", (a, b) -> a + b);
        System.out.println(str);
        System.out.println("=================");
        Integer[] sortedNum = Arrays.stream(arr)
                .sorted()
                //.toArray(l -> new Integer[l]); // l - колличество элементов которые дожили до конца
                .toArray(Integer[]::new);
        Arrays.stream(sortedNum).forEach(System.out::println);
        System.out.println("\t==================");
        Integer first = Arrays.stream(arr)
                .peek(x -> System.out.println(" x = " + x))
                .filter(x -> x > 3)
                .filter(x -> x % 2 == 0)
                .findFirst()
                .orElse(null);
        System.out.println(first);

    }
}
