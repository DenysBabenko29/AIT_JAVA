package ait.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {
        //LocalDate
        //LocalTime
        //LocalDateTime

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate gagarin = LocalDate.of(1961, 11, 12);
        System.out.println(gagarin);
        System.out.println(gagarin.getDayOfWeek());
        System.out.println(gagarin.isBefore(currentDate));

        System.out.println("======================");
        System.out.println();
        LocalDate newDate = currentDate.plusDays(20);
        System.out.println(newDate);

        LocalDate lenin = LocalDate.of(1870, 4, 22);
        long age = ChronoUnit.YEARS.between(lenin, currentDate);
        System.out.println(age);

        System.out.println(lenin.compareTo(gagarin));
        System.out.println("================================================================");
        LocalDate[] localDates = {gagarin, currentDate, lenin};
        System.out.println(Arrays.toString(localDates));
        Arrays.sort(localDates);
        System.out.println(Arrays.toString(localDates));

        System.out.println("=========================Date Formatter=================================");
        DateTimeFormatter df = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(gagarin.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
        System.out.println("=============получение даты из String===============");
        String str1 = "06/08/2020";
        LocalDate localDate = datePars(str1);
        System.out.println(localDate);
        String str2 = "2023-02-02";
        LocalDate localDate2 = datePars(str2);
        System.out.println(localDate2);
        System.out.println("========================");
        System.out.println(gagarin.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private static LocalDate datePars(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
    }
}
