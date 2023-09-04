package ait.enums.model;

public enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAI(31), JUN(30), JUL(31), AUG(31),
    SEP(30), OCT(31), NOV(30), DEC(31);

    private int days;
    private Month(int days){
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Month plusMonth(int quantity){
        int index = ordinal();
        index += quantity;
        Month[] months = Month.values();
        return months[index % months.length];
    }

    public static String getName(int num){
        Month[] months = Month.values();
        return months[(num - 1) % months.length].name();
    }
}
