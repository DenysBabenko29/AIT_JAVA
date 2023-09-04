package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer[] computers = new Computer[3];
        computers[0] = new Computer("Intel", 16, 256, "HP");
        computers[1] = new Laptop("AMD", 16, 256, "Lenovo", 18, 1.24);
        computers[2] = new Smartphone("A5", 8, 126, "Xiaomi", 12, 0.123, 9657483928736l);

       if (computers[1] instanceof Laptop){
           Laptop laptop = (Laptop) computers[1];
           System.out.println(laptop.getHours());
       }
        if (computers[0] instanceof Laptop){
            Laptop computer = (Laptop) computers[0];
            System.out.println(computer.getHours());
        }
        double TotalHours = getTotalHours(computers);
        System.out.println("Total hours: " + TotalHours);
    }

    public static void printArr(Computer[] comp){
        for(Computer x: comp){
            System.out.println(x);
        }
    }
    public static double getTotalHours(Computer[] arr){
        double res = 0;
        for(Computer x: arr){
            if (x instanceof Laptop){
                Laptop laptop = (Laptop) x;
                res += laptop.getHours();
            }
        }
        return res;
    }

}