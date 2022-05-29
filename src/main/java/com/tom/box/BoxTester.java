package com.tom.box;

import java.sql.Array;
import java.util.*;

public class BoxTester {
    public static void main(String[] args) {
//        Box box1 = new Box1();//19,16,13
//        Box box2 = new Box2();//28,25,22
//        Box box3 = new Box3();//99,88,77

        //Type 1
//        List<Box> boxs = new ArrayList<>();
//        boxs.add(new Box1());
//        boxs.add(new Box2());
//        boxs.add(new Box3());
        //Type 2
        List<Box> boxs = Arrays.asList(
                new Box1(),
                new Box2(),
                new Box3()
        );
        //Type 3 沒排序會出錯
//        Set<Box> boxs = new HashSet<>();
//        boxs.add(new Box1());
//        boxs.add(new Box2());
//        boxs.add(new Box3());

        int length = 11;
        int width = 33;
        int heigh = 15;
        boolean match = false;

        for (Box box : boxs) {
            match = box.validate(length, width, heigh);
            if (match) {
                System.out.println("Please choose " + box.name);
                break;
            }
        }
        if (!match) {
            System.out.println("No Box for your object");
        }

//        if (box1.validate(length, width, heigh)) {
//            System.out.println("Please choose Box #1");
//
//        } else if (box2.validate(length, width, heigh)) {
//            System.out.println("Please choose Box #2");
//
//        } else {
//            System.out.println("No your box objedt");
//
//        }

    }
}
