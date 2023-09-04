import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    // bbb AAAA dDd cCccc eEE
    //написать метод который принимает строку которая содержить слова, разделенные пробелом
    // и два функциональных интерфейса function и predicate

    //1. при длине слова 3 буквы меняются на строчные(маленькие)
    //2. при длине слова 4 буквы на большие
    //3. при длине 5 все буквы на *
    //
    //


    public static void main(String[] args) {
        /*
        написать лямбды используя эти интерфейсы

        1. соеденить числа num1 и num2
        2. если длина строки является 4  вернуть true
         */

        Concatable concatable = (num1, num2) -> Integer.toString(num1) + num2;
        System.out.println(concatable.concat(1, 2));
        System.out.println("========0");
        Checable checable = (s) -> s.length() == 4;
        System.out.println(checable.check("xcer"));
        System.out.println(checable.check("xce"));
        Predicate<String> predicate = s -> s.length() == 4;
        System.out.println(predicate.test("xcer"));
        System.out.println(predicate.test("xce"));

        System.out.println("\n============");
        Printable printable = (s) -> System.out.println("!" + s + "!");
        printable.print("Hello");
        Consumer<String> consumer = (s) -> System.out.println("!" + s + "!");
        consumer.accept("hello");

        System.out.println("\n============");

        Producable producable = () -> "Hello world";
        System.out.println(producable.produce());

        Supplier<String> supplier = () -> "Hello Java";
        System.out.println(supplier.get());
        System.out.println("\n============");
        Transformable transformable = String::toLowerCase;
        System.out.println(transformable.modify("WERTZ"));
        System.out.println("\n============");
        Transformable transformable1 = (s) -> s.length() == 5 ? "*****" : s;
        System.out.println(transformable1.modify("qwert"));
        System.out.println(transformable1.modify("qwertqweq"));
    }
}
