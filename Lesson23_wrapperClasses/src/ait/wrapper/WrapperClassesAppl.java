package ait.wrapper;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        int x = 20;
        Integer y = 10;
        y += 100; // java сама распаковала, сделала сложение примитивных типов и обратно запаковала в объект
        System.out.println("======= Parsing ========");
        String str1 = "42";
        x = Integer.parseInt(str1);
        x += 10;
    }
}
