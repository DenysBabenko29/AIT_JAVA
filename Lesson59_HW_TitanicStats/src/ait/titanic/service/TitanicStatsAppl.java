package ait.titanic.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TitanicStatsAppl {
    static double fare1 = 0;
    static double fare2 = 0;
    static double fare3 = 0;
    static int countPassClass1 = 0;
    static int countPassClass2 = 0;
    static int countPassClass3 = 0;
    static int countSurvivedMen = 0;
    static int countSurvivedWomen = 0;
    static int countSurvivedChildren = 0;
    static int countNonSurvivedMen = 0;
    static int countNonSurvivedWomen = 0;
    static int countNonSurvivedChildren = 0;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("train.csv"))) {
            String str = br.readLine();
            str = br.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                countSurvived(arr);
                totalFares(arr);
                str = br.readLine();
            }
            System.out.println("total fares = " + (fare1 + fare2 + fare3));
            System.out.println("Average fares for 1 class = " + (fare1 / countPassClass1));
            System.out.println("Average fares for 2 class = " + (fare2 / countPassClass2));
            System.out.println("Average fares for 3 class = " + (fare3 / countPassClass3));
            System.out.println("quantity of survived passengers = " + (countSurvivedMen + countSurvivedWomen + countSurvivedChildren));
            System.out.println("quantity of non survived passengers = " + (countNonSurvivedMen + countNonSurvivedWomen + countNonSurvivedChildren));
            System.out.println("quantity of survived men = " + countSurvivedMen);
            System.out.println("quantity of non survived men = " + countNonSurvivedMen);
            System.out.println("quantity of survived women = " + countSurvivedWomen);
            System.out.println("quantity of non survived women = " + countNonSurvivedWomen);
            System.out.println("quantity of survived children = " + countSurvivedChildren);
            System.out.println("quantity of non survived children = " + countNonSurvivedChildren);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void totalFares(String[] arr) {
        if (arr[2].equalsIgnoreCase("1")) {
            countPassClass1++;
            fare1 += Double.parseDouble(arr[10]);
        } else if (arr[2].equalsIgnoreCase("2")) {
            countPassClass2++;
            fare2 += Double.parseDouble(arr[10]);
        } else {
            countPassClass3++;
            fare3 += Double.parseDouble(arr[10]);
        }
    }

    public static void countSurvived(String[] arr) {
        if (arr[6].equals("")) {
            arr[6] = "0";
        }
        if (arr[5].equalsIgnoreCase("male") && (Double.parseDouble(arr[6]) == 0 || Double.parseDouble(arr[6]) >= 18)) {
            if (arr[1].equals("1")) {
                countSurvivedMen++;
            } else {
                countNonSurvivedMen++;
            }
        } else if (arr[5].equalsIgnoreCase("female") && (Double.parseDouble(arr[6]) == 0 || Double.parseDouble(arr[6]) >= 18)) {
            if (arr[1].equals("1")) {
                countSurvivedWomen++;
            } else {
                countNonSurvivedWomen++;
            }
        } else {
            if (arr[1].equals("1")) {
                countSurvivedChildren++;
            } else {
                countNonSurvivedChildren++;
            }
        }
    }
}
