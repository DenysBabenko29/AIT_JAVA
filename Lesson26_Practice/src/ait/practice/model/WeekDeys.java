package ait.practice.model;

import java.util.Arrays;

public class WeekDeys {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

/*
 for (int i = 0; i < daysOfWeek.length / 2; i++) {
            String temp = daysOfWeek[daysOfWeek.length - 1 - i];
            daysOfWeek[daysOfWeek.length - 1 - i] = daysOfWeek[i];
            daysOfWeek[i] = temp;
        }

 */
        String firstDay = daysOfWeek[daysOfWeek.length - 1];
        for (int i = daysOfWeek.length - 1; i > 0; i--) {
            daysOfWeek[i] = daysOfWeek[i - 1];
        }
        daysOfWeek[0] = firstDay;

        System.out.println(Arrays.toString(daysOfWeek));
        /*
        String[] newDaysOfWeek = new String[7];
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (i == 0){
                newDaysOfWeek[i] = daysOfWeek[daysOfWeek.length - 1 - i];
            } else if (i > 0 && i < daysOfWeek.length) {
                newDaysOfWeek[i] = daysOfWeek[i - 1];
            }
        }
        System.out.println(Arrays.toString(newDaysOfWeek));
         */
    }


}
