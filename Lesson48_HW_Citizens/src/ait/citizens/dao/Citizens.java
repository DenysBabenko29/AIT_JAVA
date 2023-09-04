package ait.citizens.dao;

import ait.citizens.model.Person;

public interface Citizens {
    boolean add(Person person);
    boolean remove(int id);
    Person find(int id);
    Iterable<Person> find(int minAge, int MaxAge);
    Iterable<Person> find(String lastName);
    Iterable<Person> getAllPersonsSortedById();
    Iterable<Person> getAllPersonsSortedByAge();
    Iterable<Person> getAllPersonsSortedByLastName();
    int size();
}
