package com.tom.box;

public class BoxTester {
    public static void main(String[] args) {
        Box box1 = new Box1();//19,16,13
        Box box2 = new Box2();//28,25,22

        int length = 19;
        int width = 16;
        int heigh = 28;

        if (box1.validate(length, width, heigh)) {
            System.out.println("Please choose Box #1");

        } else if (box2.validate(length, width, heigh)) {
            System.out.println("Please choose Box #2");

        } else {
            System.out.println("No your box objedt");

        }

    }
}
