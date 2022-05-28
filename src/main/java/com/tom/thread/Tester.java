package com.tom.thread;

public class Tester {
    public static void main(String[] args) {

        System.out.println("Hello 111");

        FirstThread ft = new FirstThread();
        ft.start();

        Thread rt = new Thread(new FirstRunable());
        rt.start();

        System.out.println("Hello 222");

    }
}
