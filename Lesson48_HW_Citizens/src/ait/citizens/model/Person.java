package ait.citizens.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private final int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(int id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge(){
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person: ");
        sb.append("id= ").append(id);
        sb.append(", firstName= ").append(firstName);
        sb.append(", lastName= ").append(lastName);
        sb.append(", birthDate= ").append(birthDate);
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.id);
    }
}
