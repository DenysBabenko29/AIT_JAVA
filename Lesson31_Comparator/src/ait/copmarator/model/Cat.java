package ait.copmarator.model;

public class Cat implements Comparable<Cat> {
    String name;
    int weight;
    String color;
    int age;

    public Cat(String name, int weight, String color, int age) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cats{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", color='").append(color).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void printArray(Object[] arr){
        for (Object x: arr){
            System.out.println(x);
        }
    }


    @Override
    public int compareTo(Cat o) {
        return  age - o.age;
    }
}
