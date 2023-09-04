package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Intel", 16, 256, "HP");
        comp1.display();
        Laptop laptop1 = new Laptop("AMD", 16, 256, "Lenovo", 18, 1.24);
        laptop1.display();
        Smartphone smart1 = new Smartphone("A5", 8, 126, "Xiaomi", 12, 0.123, 9657483928736l);
        smart1.display();
    }
}
