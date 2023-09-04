package ait.computer;

import java.util.Objects;

public class Computer {
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    public Computer() {
    }

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return ("Brand: [" + brand + "], CPU: [" + cpu + "], RAM: [" + ram + "], SSD: [" + ssd + "],");
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Computer)){
            return false;
        }
        Computer comp = (Computer) obj;
        return brand == comp.brand && cpu == comp.cpu && ram == comp.ram && ssd == comp.ssd;
    }

}







