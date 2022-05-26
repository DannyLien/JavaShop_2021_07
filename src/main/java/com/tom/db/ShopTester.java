package com.tom.db;

import java.sql.*;

public class ShopTester {
    public static void main(String[] args) {
        try {
            // jdbc driver
            Class.forName("org.mariadb.jdbc.Driver");
            // MariaDB connect
            Connection connection =
                    DriverManager.getConnection("jdbc:mariadb://localhost/shop", "jack", "abc333");
//                DriverManager.getConnection("jdbc:mariadb://localhost/shop","root","abc123");
//                DriverManager.getConnection("jdbc:mariadb://localhost:3306/shop?user=root&password=abc123");
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from category ");
            while (resultSet.next()) {
//                int id = resultSet.getInt(1);
//                String name = resultSet.getString(2);
//                int ver = resultSet.getInt(3);
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int ver = resultSet.getInt("version");
                System.out.println(id + "\t" + name + "\t" + ver);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
