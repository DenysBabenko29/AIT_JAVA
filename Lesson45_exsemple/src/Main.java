import autopark.Bus;
import autopark.Driver;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("22A");
        Driver marsel = new Driver("Marsel");
        Driver roman = new Driver("Roman");
        marsel.setBus(bus);
        marsel.drive();
        marsel.stopDrive();
        roman.setBus(bus);
        roman.drive();




    }
}
