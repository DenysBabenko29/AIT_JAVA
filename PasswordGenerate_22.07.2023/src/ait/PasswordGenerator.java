package ait;

import rule.AbstractBasicRule;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    public static final Random RANDOM = new Random();
    public String generate(List<AbstractBasicRule> rules){
        StringBuilder builder = new StringBuilder();
        Collections.shuffle(rules);
        for (AbstractBasicRule rule : rules){
            int ruleLEngth = rule.getLength();
            String validRuleCharters = rule.getValidCharters();

            String passPart = getPasswordPart(validRuleCharters, ruleLEngth);
            builder.append(passPart);
        }

        return builder.toString();
    }

    private String getPasswordPart(String validRuleCharters, int ruleLEngth) {

        StringBuilder partPassBuffer = new StringBuilder();
        for (int i = 0; i < ruleLEngth; i++) {
            int index = RANDOM.nextInt(validRuleCharters.length() - 1);
            char randomChar = validRuleCharters.charAt(index);
            partPassBuffer.append(randomChar);
        }
        return partPassBuffer.toString();
    }
}
