package ait.product;

public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public long getBarCode() {
        return barCode;
    }

    public String toString() {
        return "Product: " + name + ", price: " + price + ", barCode: " + barCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)){
            return false;
        }
        Product productOther = (Product) obj;
        return barCode == productOther.barCode;
    }
}