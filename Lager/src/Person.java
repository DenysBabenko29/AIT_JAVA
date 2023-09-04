public class Person implements Comparable<Person>{
    int age;
    String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(name);
        sb.append(", ").append(age);
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
