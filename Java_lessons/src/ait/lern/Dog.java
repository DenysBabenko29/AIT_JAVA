package ait.lern;

public class Dog extends Animals{
    int id;
    public Dog(int id){
        this.id = id;
    }
    @Override
    public void eat() {
        System.out.println("Dog умеет есть");
    }
    public boolean equals(Object obj) {
        Dog dogs = (Dog) obj;
        return this.id == dogs.id;
    }

}
