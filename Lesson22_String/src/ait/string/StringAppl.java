package ait.string;

public class StringAppl {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = {32, 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        System.out.println(str1);
        str = str.concat(str1);
        System.out.println(str);
    }
}
