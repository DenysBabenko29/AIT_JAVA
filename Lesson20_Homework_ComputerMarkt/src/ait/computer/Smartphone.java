package ait.computer;

public class Smartphone extends Laptop {
    private long imei;

    public Smartphone(String type, long barCode, String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
        super(type, barCode, cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Smartphone)){
            return false;
        }
        Smartphone smartOther = (Smartphone) obj;
        return getImei() == smartOther.getImei();
    }
}