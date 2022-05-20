package com.tom.shop;

public class SalesProduct extends Product {
    float discount = 1.0f;

    public SalesProduct(int id, Category category, String name, int price, float discount) {
        super(id, category, name, price);
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return (int) (discount*price);
    }
}
