package ait.supermarket.model;

import java.util.Objects;

public class Product {
    private String type;
    private String brand;
    private final long barCode;
    private double price;


    public Product(String type, String brand, long barCode, double price) {
        this.type = type;
        this.brand = brand;
        this.barCode = barCode;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public long getBarCode() {
        return barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "type= " + type + ", brand='" + brand + ", barCode= " + barCode + ", price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }
}
