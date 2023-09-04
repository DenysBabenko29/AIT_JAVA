package rule;


import util.StringUtil;

public class AlphabetLowerCaseRule extends AbstractBasicRule {

    public AlphabetLowerCaseRule(int length) {
        super(length);
    }

    @Override
    protected void setupValidCahrters() {
        this.validCharters = StringUtil.generateLowerCharters();
    }


}
