package ait.time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class DateOperations {

    public static int getAge(String birthDate){
        return (int) ChronoUnit.YEARS.between(LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]")), LocalDate.now());
    }

    public static String[] sortStringDates(String[] dates){
        String[] resDates = Arrays.copyOf(dates, dates.length);
        Comparator<String> comparator = (a, b) -> datePars(a).compareTo(datePars(b));
        Arrays.sort(resDates, comparator);
        System.out.println(Arrays.toString(resDates));
        return resDates;
    }

    private static LocalDate datePars(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
    }
}
