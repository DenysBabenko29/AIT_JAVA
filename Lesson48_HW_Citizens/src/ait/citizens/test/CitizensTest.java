package ait.citizens.test;

import ait.citizens.dao.CitizensImpl;
import ait.citizens.dao.CitizensSetImpl;
import ait.citizens.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitizensTest {
    CitizensSetImpl citizens;
    static final LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        citizens = new CitizensSetImpl(List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smidt", now.minusYears(20)),
                new Person(3, "Mary", "Jackson", now.minusYears(23)),
                new Person(4, "Rabindranath", "Tagor", now.minusYears(25))));
    }

    @Test
    void testCitizensImplListOfPerson() {
        CitizensImpl citi = new CitizensImpl(List.of(
                new Person(3, "Mary", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smidt", now.minusYears(20)),
                new Person(3, "Mary", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smidt", now.minusYears(20))));
        assertEquals(2, citi.size());
    }

    @Test
    void add() {
        assertFalse(citizens.add(null));
        assertFalse(citizens.add(new Person(2, "John", "Smidt", now.minusYears(20))));
        assertEquals(4, citizens.size());
        assertTrue(citizens.add(new Person(5, "John", "Smidt", now.minusYears(20))));
    }

    @Test
    void remove() {
        assertFalse(citizens.remove(5));
        assertEquals(4, citizens.size());
        assertTrue(citizens.remove(4));
        assertEquals(3, citizens.size());
    }

    @Test
    void findById() {
        Person person = citizens.find(1);
        assertEquals(1, person.getId());
        assertEquals("Peter", person.getFirstName());
        assertEquals("Jackson", person.getLastName());
        assertEquals(23, person.getAge());
        assertNull(citizens.find(5));
    }

    @Test
    void testFindByLastName() {
        Iterable<Person> persons = citizens.find("Jackson");
        List<Person> actual = new ArrayList<>();
        for (Person person : persons) {
            actual.add(person);
        }
        Collections.sort(actual);
        List<Person> expected = List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(3, "Mary", "Jackson", now.minusYears(23)));
        assertIterableEquals(expected, actual);
    }

    @Test
    void testFindByAgeRange() {
        Iterable<Person> persons = citizens.find(20, 23);
        List<Person> actual = new ArrayList<>();
        for (Person person : persons) {
            actual.add(person);
        }
        Collections.sort(actual);
        List<Person> expected = List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smidt", now.minusYears(20)),
                new Person(3, "Mary", "Jackson", now.minusYears(23)));
        assertIterableEquals(expected, actual);
    }

    @Test
    void getAllPersonsSortedById() {
        Iterable<Person> persons = citizens.getAllPersonsSortedById();
        int id = -1;
        int count = 0;

        for (Person person : persons) {
            count++;
            assertTrue(person.getId() > id);
            id = person.getId();
        }
        assertEquals(citizens.size(), count);
    }

    @Test
    void getAllPersonsSortedByAge() {
        Iterable<Person> persons = citizens.getAllPersonsSortedByAge();
        int age = -1;
        int count = 0;

        for (Person person : persons) {
            count++;
            assertTrue(person.getAge() >= age);
            age = person.getAge();
        }
        assertEquals(citizens.size(), count);
    }

    @Test
    void getAllPersonsSortedByLastName() {
        Iterable<Person> persons = citizens.getAllPersonsSortedByLastName();
        int count = 0;
        String lastName = "";
        for (Person person : persons) {
            count++;
            assertTrue(person.getLastName().compareTo(lastName) >= 0);
            lastName = person.getLastName();
        }
        assertEquals(citizens.size(), count);
    }

    @Test
    void size() {
        assertEquals(4, citizens.size());
    }
}