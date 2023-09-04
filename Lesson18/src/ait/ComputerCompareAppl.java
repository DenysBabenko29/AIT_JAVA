package ait;

import ait.computer.Computer;
import ait.computer.Laptop;
import ait.computer.Smartphone;

public class ComputerCompareAppl{
    public static void main(String[] args) {
        Computer[] computers = new Computer[3];
        computers[0] = new Computer("Intel", 16, 256, "HP");
        computers[1] = new Laptop("AMD", 16, 256, "Lenovo", 18, 1.24);
        computers[2] = new Smartphone("A5", 8, 126, "Xiaomi", 12, 0.123, 9657483928736l);

        Computer computer = new Computer("Intel", 16, 256, "HP");
        System.out.println(computer.equals(computers[0]));
        System.out.println("=========================");
        Laptop lap = new Laptop("AMD", 16, 256, "Lenovo", 19, 1.24);
        System.out.println(lap.equals(computers[1]));
        Smartphone smartphone = new Smartphone("A5", 8, 126,
                "Xiaomi", 12, 0.123, 9657483928736l);
        System.out.println("====================");
        System.out.println(smartphone.equals(computers[2]));
    }


    public static void printArr(Computer[] comp) {
        for (Computer x : comp) {
            System.out.println(x);
        }
    }
}