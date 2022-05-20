package com.tom.shop;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class Category {

    static final Category CATEGORY_LIFE = new Category(1, "生活用品");
    static final Category CATEGORY_COMPUTER = new Category(1, "電腦零組件");

    int id;
    String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Category> getDummyCategory() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "生活用品"));
        categories.add(new Category(2, "電腦零組件"));
        return categories;
    }

}
