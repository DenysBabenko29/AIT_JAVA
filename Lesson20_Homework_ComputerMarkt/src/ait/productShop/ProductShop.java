package ait.productShop;

import ait.computer.Computer;
import ait.computer.Laptop;
import ait.computer.Smartphone;

public class ProductShop {
    private int quantityProduct;
    Computer[] products;

    public ProductShop(int countProduct) {
        products = new Computer[countProduct];
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }
    public String addProduct(Computer comp) {
        if (quantityProduct == products.length || searchProduct(comp.getBarCode()) != null) {
            return null;
        }
        products[quantityProduct] = comp;
        quantityProduct++;
        return "Added = " + comp;
    }
    /*public String addProduct(Computer comp) {
        if (quantityProduct == products.length || searchProduct(comp.getBarCode()) != null) {
            return null;
        }
        products[quantityProduct] = comp;
        quantityProduct++;
        return "Added = " + comp;
    }

    public String addProduct(Laptop laptop) {
        if (quantityProduct == products.length || searchProduct(laptop.getBarCode()) != null) {
            return null;
        }
        products[quantityProduct] = laptop;
        quantityProduct++;
        return  "Added = " + laptop;
    }

    public String addProduct(Smartphone smartphone) {
        if (quantityProduct == products.length || searchProduct(smartphone.getBarCode()) != null) {
            return null;
        }
        products[quantityProduct] = smartphone;
        quantityProduct++;
        return  "Added = " + smartphone;
    }

*/

    public Computer searchProduct(long barCode) {
        for (int i = 0; i < quantityProduct; i++) {
            if (barCode == products[i].getBarCode())
                return products[i];
        }
        return null;
    }

    public void printProduct(){
        for (int i = 0; i < quantityProduct; i++) {
            System.out.println(products[i]);
        }
    }

    public String removeProduct(long barCode){
        for (int i = 0; i < quantityProduct; i++) {
            if (barCode == products[i].getBarCode()){
                Computer temp = products[i];
                products[i] = products[quantityProduct - 1];
                products[quantityProduct - 1] = null;
                quantityProduct--;
                return "Deleted = " + temp;
            }
        }
        return null;
    }
}
