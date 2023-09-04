package ait.supermarket.model;

import java.util.Objects;

public class Food extends Product{
    private String compound;
    private int termin; // срок хранения
    private String vendor; // поставщик

    public Food(String type, String brand, long barCode, double price, String compound, int termin) {
        super(type, brand, barCode, price);
        this.compound = compound;
        this.termin = termin;
    }

    public String getCompound() {
        return compound;
    }

    public int getTermin() {
        return termin;
    }

    public void setBeforeDate(String beforeDate) {
        this.termin = termin;
    }

    @Override
    public String toString() {
        return super.toString() + ", compound= " + compound + ", termin= " + termin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Food food = (Food) o;
        return super.equals(food.equals(food.getBarCode()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), compound, termin, vendor);
    }
}
