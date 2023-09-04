package ait.optional.person;

import ait.optional.person.model.Person;

public class PersonOptionalAppl {
    public static void main(String[] args) {
        Person[] persons = {new Person("John", 28),
        new Person("Mary", 19),
        new Person("Peter", 25)};
        Person person = findPersonByAge(persons, 19);
        System.out.println(person.getName());
    }

    public static Person findPersonByAge(Person[] persons, int age){
        Person person = null;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() == age){
                person = persons[i];
                break;
            }
        }
        return person;
    }
}
