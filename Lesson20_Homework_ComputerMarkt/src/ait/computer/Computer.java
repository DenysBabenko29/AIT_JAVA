package ait.computer;

public class Computer {
    private String type;
    private long barCode;
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    public Computer() {
    }

    public Computer(String type, long barCode, String cpu, int ram, int ssd, String brand) {
        this.type = type;
        this.barCode = barCode;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public long getBarCode() {
        return barCode;
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
        return ("Type: " + type + ", Barcode: " + barCode + ", Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd);
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Computer)){
            return false;
        }
        Computer comp = (Computer) obj;
        return barCode == comp.getBarCode();
    }
}







