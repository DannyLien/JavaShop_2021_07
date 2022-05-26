package com.tom.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box {
    int id;
    String name;
    int length;
    int width;
    int heigh;
    int price;

    public Box() {
        super();
    }

    public Box(int id, String name, int length, int width, int heigh, int price) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.width = width;
        this.heigh = heigh;
        this.price = price;
    }

    public Box(Box box) {
        this.id = box.id;
        this.name = box.name;
        this.length = box.length;
        this.width = box.width;
        this.heigh = box.heigh;
        this.price = box.price;
    }


    public static List<Box> getBoxFromDB() {
        List<Box> list = new ArrayList<>();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mariadb://localhost/box", "tom", "abc777");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from box");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int heigh = rs.getInt("heigh");
                int price = rs.getInt("price");
                list.add(new Box(id, name, length, width, heigh, price));
            }
            rs.close();
            stmt.close();
            connection.close();
//            System.out.println(list);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean validate(int length, int width, int heigh) {
        List<Integer> list = new ArrayList<>();
        list.add(length);
        list.add(width);
        list.add(heigh);
        Collections.sort(list);
        return list.get(2) <= this.length && list.get(1) <= this.width && list.get(0) <= this.heigh;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + length + "\t" + width + "\t" + heigh + "\t" + price;
    }
}
