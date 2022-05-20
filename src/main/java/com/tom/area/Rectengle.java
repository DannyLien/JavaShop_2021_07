package com.tom.area;

public class Rectengle implements Shape {
    float width;
    float height;

    public Rectengle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Float getArea() {
        return (width * height);
    }
}
