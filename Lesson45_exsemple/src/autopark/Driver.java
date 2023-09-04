package autopark;

public class Driver{
    private Bus bus;
    private String name;


    public Driver(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")){
            this.name = name;
        }
    }
    public void setBus(Bus bus){
        if (bus != null && !bus.equals("")){
            if (bus.isGoing()){
                System.err.println(this.name + ": На ходу водителя не меняют");
                return;
            }
            System.out.println(this.name + " пошел в автобус <" + bus.getNumber() + ">");
            this.bus = bus;
            this.bus.setDriver(this);
        } else {
            System.err.println("Нельзя положить null-автобус");
        }
    }
    public void free(){
        this.bus = null;
    }
    public void drive(){
        if (this.bus != null){
            System.out.println(this.name + " поехал на автобусе <" + bus.getNumber() + ">");
            this.bus.go();
        } else {
            System.err.println("У водителя " + this.name + " нет автобуса");
        }
    }
    public void stopDrive(){
        if (bus != null){
            this.bus.stop();
        } else {
            System.err.println("У водителя нет автобуса, останавливать нечего");
        }
    }

}
