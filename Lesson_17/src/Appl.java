import ait.product.Product;
import ait.product.food.MeatFood;
import ait.product.food.MilkFood;

public class Appl {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new MeatFood(6.4, "Steak", 65738491827345677L,
                "30.06.2023", "beef");
        products[1] = new MilkFood(2.99, "cheese", 237834298987249L,
                "3.07.2023", "goat", 34.4);



    }

    public static void pritnArr(Product[] arr) {
        for (Product x : arr) {
            x.toString();
        }
    }
}
