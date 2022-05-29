package com.tom.box;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box {
    String name;
    int length;
    int width;
    int heigh;

    public Box(int length, int width, int heigh) {
        this.length = length;
        this.width = width;
        this.heigh = heigh;
    }

    public Box(String name, int length, int width, int heigh) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.heigh = heigh;
    }

    public boolean validate(int length, int width, int heigh) {
        List<Integer> list = new ArrayList<>();
        list.add(length);
        list.add(width);
        list.add(heigh);
        Collections.sort(list);
//        System.out.println(list.toString());
//        System.out.println(this.length + "\t" + this.width + "\t" + this.heigh);
        return list.get(list.size() - 1) <= this.length &&
                list.get(list.size() - 2) <= this.width &&
                list.get(list.size() - 3) <= this.heigh;
    }


}
