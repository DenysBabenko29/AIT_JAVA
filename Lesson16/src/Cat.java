public class Cat extends Pet {

    private String name;
    private String breed;
    private int age;

    public Cat(String type, double weight, boolean pet, String name, String breed, int age) {
        super(type, weight, pet);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Cat " + name + " is eating..");
    }
    public void sleep(){
        System.out.println("Cat " + name + " is sleeping...");
    }
    public void voise(){
        System.out.println("Cat " + name + " May...");
    }
}