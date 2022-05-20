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
        this.category = category;
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
                Product produc = new Product(
                        Integer.parseInt(tokens[0]),
                        categories.get(Integer.parseInt(tokens[1]) - 1),
                        tokens[2],
                        Integer.parseInt(tokens[3])
                );
                if (tokens.length > 4) {
                    produc.discount = Float.parseFloat(tokens[4]);
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

    private int getPrice() {
        return isSales() ? (int) (discount * price) : price;
    }

    private boolean isSales() {
        return (discount < 1.0f) ? true : false;
    }

    public void publish() {

    }

}
