package ait.product.food;
import ait.product.Product;

public class Food extends Product {
    private String expDate;

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String toString() {
        return super.toString() + ", expDate: " + expDate;
    }
}
