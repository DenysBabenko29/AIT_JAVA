package ait.computer.model;

public class Smartphone extends Laptop {
    private long ibsn;

    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight, long ibsn) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.ibsn = ibsn;
    }

    public long getIbsn() {
        return ibsn;
    }

    public void setIbsn(long ibsn) {
        this.ibsn = ibsn;
    }

    public void display() {
        System.out.println("Brand - " + getBrand() + ", CPU - " + getCpu() + ", RAM - " + getRam() + ", SSD - " + getSsd() +
                ", Hours - " + getHours() + ", Weight - " + getWeight() + ", IBSN - " + ibsn);
    }
}
