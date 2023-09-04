public class Dog extends Pet{
    private String name;
    private String breed;
    private int age;

    public Dog(String type, double weight, boolean pet, String name, String breed, int age) {
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
        System.out.println("Dog " + name + " is eating..");
    }
    public void sleep(){
        System.out.println("Dog " + name + " is sleeping...");
    }
    public void walk(){
        System.out.println("Dog " + name + " is walking");
    }
    public void voise(){
        System.out.println("Dog " + name + "Gavv...");
    }
}
