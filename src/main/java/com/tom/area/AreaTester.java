package com.tom.area;

import java.util.ArrayList;
import java.util.List;

public class AreaTester {
    public static void main(String[] args) {
//        basic();
        list();

    }

    private static void list() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(10, 10));
        shapes.add(new Rectengle(10, 10));
        shapes.add(new Triangle(20, 30));
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }

    private static void basic() {
        Triangle triangle = new Triangle(10, 10);
        Rectengle rectengle = new Rectengle(20, 10);

        System.out.println(triangle.getArea());
        System.out.println(rectengle.getArea());
    }
}
