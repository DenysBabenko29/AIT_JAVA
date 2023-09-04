public class HauswAppl {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat", 4.5, true, "Mia", "Abyssinian", 6);
        Cat cat2 = new Cat("Cat", 2.5, true, "Lia", "Angora", 4);
        Cat cat3 = new Cat("Cat", 1.5, true, "Kia", "Balinese", 1);

        Dog dog1 = new Dog("Dog", 6, true, "Bob", "Taksa", 4);
        Dog dog2 = new Dog("Dog", 18, true, "Karl", "labrador", 3);

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        dog1.sleep();
        dog2.sleep();

        cat1.voise();
        cat2.voise();
        cat3.voise();
        dog1.voise();
        dog2.voise();

        cat1.eat();
        cat2.eat();
        cat3.eat();
        dog1.eat();
        dog2.eat();

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        dog1.walk();
        dog2.walk();

        dog1.sleep();
        dog2.sleep();
    }
}
