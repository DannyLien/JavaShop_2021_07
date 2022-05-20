package com.tom.shop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Product {
    int id;
    String name;
    int price;
    Category category;
    float discount = 1.0f;

    public Product() {
        super();
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, Category category, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public static List<Product> getDummyFromFile() {
        List<Product> products = new ArrayList<>();
        List<Category> categories = Category.getDummyCategory();

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] tokens = line.split(",");
                //
                int id = Integer.parseInt(tokens[0]);
                Category category = categories.get(Integer.parseInt(tokens[1]) - 1);
                String name = tokens[2];
                int price = Integer.parseInt(tokens[3]);
                //
                Product produc;
                if (tokens.length > 4) {
                    float discount = Float.parseFloat(tokens[4]);
                    produc = new SalesProduct(id, category, name, price, discount);
                } else {
                    produc = new Product(id, category, name, price);
                }
                products.add(produc);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + getPrice();
    }

    public int getPrice() {
        return price;
    }

    public void publish() {
    }

}
