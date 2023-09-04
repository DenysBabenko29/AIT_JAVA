package autopark;

public class Passenger{
    private Bus bus;
    private String name;
    private boolean inBus;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void goToBus(Bus bus){
        if (inBus){
            System.err.println("Я что-ли на ходу буду выпрыгивать");
            return;
        }
        if (bus == null){
            System.err.println(this.name + " я не могу пойти в несуществующий автобус");
            return;
        }
        if (bus.isGoing()){
            System.err.println(this.name + ": Не буду я пригать в едущий автобус!");
            return;
        }
        if (bus.isFull()){
            System.err.println(this.name + " автобус забить людьми! для меня нет места!!");
            return;
        }

        System.out.println("Пассажир " + this.name + " сел в автобус <" + bus.getNumber() + ">");
        bus.addPassenger(this);
        this.bus = bus;


    }
}
