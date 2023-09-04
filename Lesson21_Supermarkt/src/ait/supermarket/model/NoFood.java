package ait.supermarket.model;

public class NoFood extends Product{
    private String compound;
    private String color;
    private double weight;

    public NoFood(String type, String brand, long barCode, double price, String compound, String color, double weight) {
        super(type, brand, barCode, price);
        this.compound = compound;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", compound= " + compound + ", color= " + color + ", weight= " + weight;
    }
}
