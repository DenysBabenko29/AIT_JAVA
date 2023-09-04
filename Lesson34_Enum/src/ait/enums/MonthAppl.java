package ait.enums;

import ait.enums.model.Month;

public class MonthAppl {
    public static void main(String[] args) {
        Month month = Month.DEC;
        System.out.println(month.plusMonth(13));
        System.out.println();
        System.out.println(Month.getName(14));
        System.out.println(Month.FEB.getDays());
    }
}
