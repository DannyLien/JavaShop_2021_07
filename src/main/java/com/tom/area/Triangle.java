package com.tom.area;

public class Triangle implements Shape {
    float width;
    float height;

    public Triangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Float getArea() {
        return (width * height) / 2;
    }
}
