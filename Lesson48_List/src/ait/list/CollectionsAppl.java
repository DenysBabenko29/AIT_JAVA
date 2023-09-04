package ait.list;

import java.util.*;

public class CollectionsAppl {
    public static void main(String... args) {
        List<String> technologis = new ArrayList<>(Arrays.asList("Java", "JCF", "Git", "JUnit", "SQL", "MongoDB", "Spring", "Hibernate"));
        technologis.add("Kafka");
        System.out.println("===== colections sort =====");
        Collections.sort(technologis);
        technologis.forEach(t -> System.out.println(t));
        int index = Collections.binarySearch(technologis, "JCF");
        System.out.println("index = " + index);
        index = Collections.binarySearch(technologis, "K8s");
        System.out.println("index = " + index);

        System.out.println("===== colections sort by comparator =====");
        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        Collections.sort(technologis, comparator);
        technologis.forEach(t -> System.out.println(t));
        index = Collections.binarySearch(technologis, "SQL", comparator); // ищет по длине
        System.out.println("index = " + index);
        index = Collections.binarySearch(technologis, "K8s", comparator);
        System.out.println("index = " + index);
    }
}
