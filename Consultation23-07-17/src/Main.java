public class Main {
    public static void main(String[] args) {
// 4a2b3cd
        String str = convert("4a2b3cd");
        System.out.println(str);
    }

    public static String convert(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int t = 0;
            while (Character.isDigit(str.charAt(i + t))) {
                t++;
            }

            if (t > 0) {
                int num = Integer.parseInt(str.substring(i, i + t));
                i += t;

                for (int j = 0; j < num; j++) {
                    builder.append(str.charAt(i));
                }
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

}

