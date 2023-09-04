package util;

public class StringUtil {
    public static String generateLowerCharters() {
        StringBuilder builder = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            builder.append(i);
        }
        return builder.toString();
    }
}
