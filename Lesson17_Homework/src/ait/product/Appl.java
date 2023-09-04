package ait.product;

import ait.product.Product;
import ait.product.module.Food;
import ait.product.module.MeatFood;
import ait.product.module.MilkFood;

public class Appl {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new MeatFood(6.4, "Steak", 65738491827345677L,
                "30.06.2023", "beef");
        products[1] = new MilkFood(2.99, "Cheese", 237834298987249L,
                "3.07.2023", "goat", 34.4);
        products[2] = new MeatFood(4.2, "Goulash", 34354389753987L, "19.06.2023", "chicken");
        products[3] = new MilkFood(2.19, "Cottage cheese", 32438598359085L, "14.06.2023", "cow", 15);
        products[4] = new Product(18.2, "Washing powder", 2789749279842L);
        products[5] = new Product(4.8, "Toilet paper", 28923787247979L);
        products[6] = new MilkFood(2.19, "Cottage cheese", 32438598359085L, "14.06.2023", "cow", 15);


        pritnArr(products);
        System.out.println("=========================");
        System.out.println("Summa: " + sumProducts(products));
        System.out.println("=========================");
        System.out.println("Product is " + products[0].equals(products[1]));
        System.out.println("Product is " + products[3].equals(products[6]));
        System.out.println("Product is " + products[4].equals(products[5]));
        System.out.println("=========================");
        nonFoodProducts(products);
        System.out.println("==========================");
        Product searcRes = searchProduct(324385983595L, products);
        System.out.println("Result: " + searcRes);
        searcRes = searchProduct(28923787247979L, products);
        System.out.println("Result: " + searcRes);
    }
    public static void pritnArr(Product[] arr) {
        for (Product x : arr) {
            System.out.println(x.toString());
        }
    }
    public static double sumProducts(Product[] arr) {
        double sum = 0;
        for (Product x : arr) {
            sum += x.getPrice();
        }
        return sum;
    }
    public static void nonFoodProducts(Product[] product) {
        for (Product x : product) {
            if (!(x instanceof Food)) {
                System.out.println("NonFoodProducts: " + x);
            }
        }
    }

    public static Product searchProduct(long code, Product[] arr) {
        for (Product x : arr) {
            if (x.getBarCode() == code) {
                return x;
            }
        }
        return null;
    }
}
