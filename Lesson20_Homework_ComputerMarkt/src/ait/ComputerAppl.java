package ait;

import ait.computer.Computer;
import ait.computer.Laptop;
import ait.computer.Smartphone;
import ait.productShop.ProductShop;

public class ComputerAppl {
    public static void main(String[] args) {
        ProductShop productShop = new ProductShop(10);

        productShop.addProduct(new Computer("Computer", 532767382438278L, "Intel", 16, 256, "HP"));
        productShop.addProduct(new Laptop("Laptop", 643287563563938568L,"AMD", 16, 256, "Lenovo", 18, 1.24));
        productShop.addProduct(new Smartphone("Smartphone", 3987495772573590753L , "A5", 8, 126, "Xiaomi", 12, 0.123, 654876596536538L));
        productShop.addProduct(new Smartphone("Smartphone", 4087495772373590753L , "A6", 4, 256, "Xiaomi", 24, 0.233, 654876596536538L));


        productShop.printProduct();
        System.out.println("=======================");
        System.out.println(productShop.searchProduct(643287563563938568L));
        System.out.println(productShop.searchProduct(64328756356393868L));
        System.out.println("=======================");
        System.out.println(productShop.removeProduct(3987495772573590753L));
        System.out.println(productShop.removeProduct(87495772573590753L));
        System.out.println("=======================");
        productShop.printProduct();
        System.out.println("=====================");
        Computer comp1 = productShop.searchProduct(643287563563938568L);
        System.out.println(comp1);
        System.out.println("=======================");



    }

}