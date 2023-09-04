package ait.simply;

import java.util.Random;

public class SymplyPasswordGenerator {
    private static final int PASSLENGTH = 20;

    public static void main(String[] args) {
        String password = generatePassword(PASSLENGTH);
        System.out.println(password);
    }

    private static String generatePassword(int length) {
        final Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(getRandomSymbol(random));
        }
        return builder.toString();
    }

    private static char getRandomSymbol( final Random random) {
        final int min = 32;
        final int max = 125;
        return (char) (random.nextInt(max - min) + min);
    }

}
