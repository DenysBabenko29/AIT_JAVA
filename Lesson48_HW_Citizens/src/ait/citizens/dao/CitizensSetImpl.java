package ait.citizens.dao;

import ait.citizens.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CitizensSetImpl implements Citizens{

    private Set<Person> idSet;
    private Set<Person> lastNameSet;
    private Set<Person> ageSet;


    private static TreeSet<Person> setLastNameComparator = new TreeSet<>((p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName());
        return res = res != 0 ? res : Integer.compare(p1.getId(), p2.getId());
    });

    private static TreeSet<Person> setAgeComparator = new TreeSet<>((p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge());
        return res = res != 0 ? res : Integer.compare(p1.getId(), p2.getId());
    });

    public CitizensSetImpl() {
        this.idSet = new TreeSet<>();
        this.lastNameSet = new TreeSet<>(setLastNameComparator);
        this.ageSet = new TreeSet<>(setAgeComparator);
    }

    public CitizensSetImpl(List<Person> persons) {
        this();
        persons.forEach(p -> add(p));
    }

    //O(1)
    @Override
    public boolean add(Person person) {
        if (person == null) return false;

        idSet.add(person);
        lastNameSet.add(person);
        ageSet.add(person);

        return true;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public Person find(int id) {
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int MaxAge) {
        return null;
    }

    @Override
    public Iterable<Person> find(String lastName) {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
