package rule;

public abstract class  AbstractBasicRule {
    protected int length;
    protected String validCharters;

    protected AbstractBasicRule(int length) {
        this.length = length;
        this.setupValidCahrters();
    }

    public int getLength() {
        return length;
    }

    public String getValidCharters() {
        return validCharters;
    }

    protected abstract void setupValidCahrters();
}
