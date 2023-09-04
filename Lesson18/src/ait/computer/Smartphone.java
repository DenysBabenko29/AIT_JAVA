package ait.computer;

import java.util.Objects;

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

    public String toString() {
        return super.toString() + ", IBSN - " + ibsn;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Smartphone)){
            return false;
        }
        Smartphone smartOther = (Smartphone) obj;
        return super.equals(smartOther) && ibsn == smartOther.ibsn;
    }
}