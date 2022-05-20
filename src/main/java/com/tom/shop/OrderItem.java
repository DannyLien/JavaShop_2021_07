package com.tom.shop;

public class OrderItem extends Product {
    int qty = 1;

    public OrderItem(Product product, int qty) {
        this.qty = qty;
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        this.category = product.category;
    }

    public OrderItem(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        this.category = product.category;
        this.qty = 1;
    }
}
