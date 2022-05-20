package com.tom.shop;

import javax.print.attribute.standard.PrinterURI;
import java.util.List;

public class Tester {

    public static void main(String[] args) {

        List<Category> categories = Category.getDummyCategory();
        for (Category category : categories) {
            System.out.println(category.name);
        }

        List<Product> products = Product.getDummyFromFile();
        for (Product product : products) {
//            System.out.println(product.name + "*");
            // add discount
            System.out.println(product);
        }

//        Product toothbrush = new Product(1, "牙刷", 150);
        Product toothbrush = new Product("牙刷", Category.CATEGORY_LIFE);
        toothbrush.publish();
//        Product mouse = new Product(2, "滑鼠", 99);
        Product mouse = new Product(1, Category.CATEGORY_COMPUTER, "滑鼠", 99);
        mouse.publish();

        OrderItem item = new OrderItem(mouse, 3);
        System.out.println("item.total = " + (item.qty * item.price));

    }


}
