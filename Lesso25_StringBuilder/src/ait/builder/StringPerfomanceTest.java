package ait.builder;

public class StringPerfomanceTest {
    //String
    private static final int N_ITERATION = 100_000;
    private static final String WORD = "meow";

    public static void main(String[] args) {
        String str = "";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATION; i++) {
            str += WORD;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

        t1 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < N_ITERATION; i++) {
            builder.append(WORD);
        }
        str = builder.toString();
        t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

    }


}
