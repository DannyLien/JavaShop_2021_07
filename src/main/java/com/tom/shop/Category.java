package com.tom.shop;

import java.lang.invoke.CallSite;
import java.sql.*;
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

    public static List<Category> getCategoryFromDB() {
        List<Category> categories = new ArrayList<>();
        try {
            //ReadCategoryFromDB
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/shop?user=jack&password=abc333");
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from category");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                categories.add(new Category(id, name));
            }
            resultSet.close();
            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
}
