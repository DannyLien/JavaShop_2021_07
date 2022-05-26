package com.tom.db;

//box sql
//box table
//box data (id, name, length, width, heigh, price)
//1,Box1,33,22,11,60   //2,Box2,66,55,44,70    //3,Box3,99,88,77,80

import java.util.List;
import java.util.Scanner;

public class BoxExasm {
    public static void main(String[] args) {
        //get box from DB
        List<Box> boxList = Box.getBoxFromDB();
        Box box1 = null;
        Box box2 = null;
        Box box3 = null;
        for (Box box : boxList) {
            if (box.id == 1) {
                box1 = new Box(box);
            } else if (box.id == 2) {
                box2 = new Box(box);
            } else if (box.id == 3) {
                box3 = new Box(box);
            }
        }

        Scanner sc = new Scanner(System.in);
        //please enter length
        System.out.print("Please Enter Box Length : ");
        int length = sc.nextInt();
        //please enter width
        System.out.print("Please Enter Box Width : ");
        int width = sc.nextInt();
        //please enter heigh
        System.out.print("Please Enter Box Heigh : ");
        int heigh = sc.nextInt();

        //please choose box??
        if (box1.validate(length, width, heigh)) {
            System.out.println("Please choose " + box1.name + " , NT:" + box1.price);
        } else if (box2.validate(length, width, heigh)) {
            System.out.println("Please choose " + box2.name + " , NT:" + box2.price);
        } else if (box3.validate(length, width, heigh)) {
            System.out.println("Please choose " + box3.name + " , NT:" + box3.price);
        } else {
            System.out.println("No Box for your object");
        }

    }
}
