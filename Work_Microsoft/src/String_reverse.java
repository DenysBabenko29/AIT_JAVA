import java.io.BufferedReader;

public class String_reverse {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseByCharAt(str));
        System.out.println(reverseByStringBuilder(str));


    }

    private static String reverseByCharAt(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    private static String reverseByStringBuilder(String str){
        StringBuilder builder = new StringBuilder();
        builder.append(str).reverse();
        return builder.toString();
    }


}
