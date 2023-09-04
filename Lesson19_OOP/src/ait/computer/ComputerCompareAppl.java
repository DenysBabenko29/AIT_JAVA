package ait.computer;

import ait.computer.model.Computer;

import java.util.Scanner;

public class ComputerCompareAppl{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer1 = new Computer("i5", 16, 256, "HP");
        System.out.print("Enter cpu: ");
        String cpu = scanner.next();
        System.out.print("Enter ram: ");
        int ram = scanner.nextInt();
        System.out.print("Enter ssd: ");
        int ssd = scanner.nextInt();
        System.out.print("Enter brand: ");
        String brand = scanner.next();
        Computer computer2 = new Computer(cpu, ram, ssd, brand);
        Computer computer3 = new Computer("i5", 16, 256, "HP");
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.equals(computer3));
        System.out.println(computer2.equals(computer3));

    }


    public static void printArr(Computer[] comp) {
        for (Computer x : comp) {
            System.out.println(x);
        }
    }
}